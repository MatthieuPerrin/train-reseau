import fr.perrin.trains.simulator.ApplicationTrain;
import fr.perrin.trains.simulator.Complex;
import fr.perrin.trains.simulator.Edge;
import fr.perrin.trains.simulator.GraphSegment;

public class MonReseau extends ApplicationTrain {

	private static final long serialVersionUID = 1L;

	@Override public void initialize() {
		addNode(new Complex (500.0, 905.0), "PG01");
		addNode(new Complex (510.0, 915.0), "PL01");
		addNode(new Complex (340.0, 915.0), "PL02");
		addNode(new Complex (510.0, 895.0), "PL04");
		addNode(new Complex (340.0, 895.0), "PL03");
		addNode(new Complex (610.0, 905.0), "PL05");
		addNode(new Complex (810.0, 905.0), "PL06");
		addNode(new Complex (560.0, 905.0), "AX01");
		addNode(new Complex (810.0, 875.0), "AX02");
		addNode(new Complex (810.0, 845.0), "PL07");
		addNode(new Complex (790.0, 845.0), "PL08");
		addNode(new Complex (810.0, 815.0), "AX03");
		addNode(new Complex (810.0, 785.0), "PL09");
		addNode(new Complex (790.0, 785.0), "PL10");
		GraphSegment g;
		Edge e;
		g = new GraphSegment("S01");
		e = new Edge();
		e.addNode(new Complex(510.0,915.0));
		e.addNode(new Complex(340.0,915.0));
		g.addEdge(e);
		addSegment(g);
		g = new GraphSegment("S02");
		e = new Edge();
		e.addNode(new Complex(340.0,915.0));
		e.addNode(new Complex(290.0,940.0));
		e.addNode(new Complex(190.0,940.0));
		e.addNode(new Complex(140.0,905.0));
		e.addNode(new Complex(190.0,870.0));
		e.addNode(new Complex(290.0,870.0));
		e.addNode(new Complex(340.0,895.0));
		g.addEdge(e);
		addSegment(g);
		g = new GraphSegment("S03");
		e = new Edge();
		e.addNode(new Complex(340.0,895.0));
		e.addNode(new Complex(510.0,895.0));
		g.addEdge(e);
		addSegment(g);
		g = new GraphSegment("X01");
		e = new Edge();
		e.addNode(new Complex(610.0,905.0));
		e.addNode(new Complex(560.0,905.0));
		e.addNode(new Complex(510.0,915.0));
		g.addEdge(e);
		e = new Edge();
		e.addNode(new Complex(510.0,895.0));
		e.addNode(new Complex(560.0,905.0));
		e.addNode(new Complex(610.0,905.0));
		g.addEdge(e);
		addSegment(g);
		g = new GraphSegment("S04");
		e = new Edge();
		e.addNode(new Complex(610.0,905.0));
		e.addNode(new Complex(810.0,905.0));
		g.addEdge(e);
		e = new Edge();
		e.addNode(new Complex(810.0,905.0));
		e.addNode(new Complex(610.0,905.0));
		g.addEdge(e);
		addSegment(g);
		g = new GraphSegment("X02");
		e = new Edge();
		e.addNode(new Complex(810.0,905.0));
		e.addNode(new Complex(810.0,875.0));
		e.addNode(new Complex(810.0,845.0));
		g.addEdge(e);
		e = new Edge();
		e.addNode(new Complex(810.0,845.0));
		e.addNode(new Complex(810.0,875.0));
		e.addNode(new Complex(810.0,905.0));
		g.addEdge(e);
		e = new Edge();
		e.addNode(new Complex(810.0,905.0));
		e.addNode(new Complex(810.0,875.0));
		e.addNode(new Complex(790.0,845.0));
		g.addEdge(e);
		e = new Edge();
		e.addNode(new Complex(790.0,845.0));
		e.addNode(new Complex(810.0,875.0));
		e.addNode(new Complex(810.0,905.0));
		g.addEdge(e);
		addSegment(g);
		g = new GraphSegment("X03");
		e = new Edge();
		e.addNode(new Complex(810.0,845.0));
		e.addNode(new Complex(810.0,815.0));
		e.addNode(new Complex(810.0,785.0));
		g.addEdge(e);
		e = new Edge();
		e.addNode(new Complex(810.0,845.0));
		e.addNode(new Complex(810.0,815.0));
		e.addNode(new Complex(790.0,785.0));
		g.addEdge(e);
		e = new Edge();
		e.addNode(new Complex(810.0,785.0));
		e.addNode(new Complex(810.0,815.0));
		e.addNode(new Complex(810.0,845.0));
		g.addEdge(e);
		e = new Edge();
		e.addNode(new Complex(790.0,785.0));
		e.addNode(new Complex(810.0,815.0));
		e.addNode(new Complex(810.0,845.0));
		g.addEdge(e);
		addSegment(g);
	}

	@Override public String getName() {
		return("MonReseau");
	}

	public static void main(String[] args) {
		new MonReseau().start();
	}
}