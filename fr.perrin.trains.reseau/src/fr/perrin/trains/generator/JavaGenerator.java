package fr.perrin.trains.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

import fr.perrin.trains.reseau.Bidir;
import fr.perrin.trains.reseau.DeclarationPoint;
import fr.perrin.trains.reseau.Point;
import fr.perrin.trains.reseau.Segment;
import fr.perrin.trains.reseau.SegmentPart;
import fr.perrin.trains.reseau.Unidir;
import fr.perrin.trains.simulator.Complex;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
public class JavaGenerator {

	private PointToComplex points;
	private ReseauGenerator reseau;
	private StringBuffer s;
	private String name;
	
	private String generateJava (Resource resource) {
		s = new StringBuffer();
		s.append("import fr.perrin.trains.simulator.ApplicationTrain;\n");
		s.append("import fr.perrin.trains.simulator.Complex;\n");
		s.append("import fr.perrin.trains.simulator.Edge;\n");
		s.append("import fr.perrin.trains.simulator.GraphSegment;\n\n");
		s.append("public class ");
		s.append(name);
		s.append(" extends ApplicationTrain {");
		s.append("\n\n\tprivate static final long serialVersionUID = 1L;");
		s.append("\n\n\t@Override public void initialize() {");

		for(DeclarationPoint point : reseau.getPoints(resource)) {
			Complex c = points.evaluate(point.getXy());
			s.append("\n\t\taddNode(new Complex (");
			s.append(c.x);
			s.append(", ");
			s.append(c.y);
			s.append("), \"");
			s.append(point.getName());
			s.append("\");");
		}

		s.append("\n\t\tGraphSegment g;");
		s.append("\n\t\tEdge e;");
		for(Segment segment : reseau.getSegments(resource)) {
			s.append("\n\t\tg = new GraphSegment(\"");
			s.append(segment.getName());
			s.append("\");");
			for(SegmentPart part : segment.getParts()) {// int i = 1; i < parts.size(); i++) {
				s.append("\n\t\te = new Edge();");
				if(part.getNext() instanceof Unidir) {
					extendPath(part.getFst(), (Unidir) part.getNext());
				} else if(part.getNext() instanceof Bidir) {
					extendPath(part.getFst(), (Bidir) part.getNext());
				}
				s.append("\n\t\tg.addEdge(e);");
			}
			s.append("\n\t\taddSegment(g);");
		}
		s.append("\n\t}\n\n\t@Override public String getName() {");
		s.append("\n\t\treturn(\"");
		s.append(name);
		s.append("\");\n\t}\n\n\tpublic static void main(String[] args) {\n\t\tnew ");
		s.append(name);
		s.append("().start();\n\t}\n}");
		return s.toString();
	}
	
	private void extendPath (Point fst, Unidir next) {
		Complex c = points.evaluate(fst);
		s.append("\n\t\te.addNode(new Complex(" + c.x + "," + c.y + "));");
		for(int i = 0; i < next.getPts().size(); i++) {
			c = points.evaluate(next.getPts().get(i));
			s.append("\n\t\te.addNode(new Complex(" + c.x + "," + c.y + "));");
		}
	}
	private void extendPath (Point fst, Bidir next) {
		Complex c = points.evaluate(fst);
		s.append("\n\t\te.addNode(new Complex(" + c.x + "," + c.y + "));");
		for(int i = 0; i < next.getPts().size(); i++) {
			c = points.evaluate(next.getPts().get(i));
			s.append("\n\t\te.addNode(new Complex(" + c.x + "," + c.y + "));");
		}
		s.append("\n\t\tg.addEdge(e);");
		s.append("\n\t\te = new Edge();");
		for(int i = next.getPts().size() - 1; i >= 0; i--) {
			c = points.evaluate(next.getPts().get(i));
			s.append("\n\t\te.addNode(new Complex(" + c.x + "," + c.y + "));");
		}
		c = points.evaluate(fst);
		s.append("\n\t\te.addNode(new Complex(" + c.x + "," + c.y + "));");
	}

	void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		name = resource.getURI().trimFileExtension().lastSegment();
		points = new PointToComplex();
		points.initialize(resource);
		reseau = new ReseauGenerator();
		fsa.generateFile(name + ".java", generateJava(resource));
	}

}
