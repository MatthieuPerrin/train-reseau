/*
 * generated by Xtext 2.20.0
 */
package fr.perrin.trains.serializer;

import com.google.inject.Inject;
import fr.perrin.trains.reseau.Angle;
import fr.perrin.trains.reseau.Argument;
import fr.perrin.trains.reseau.Bidir;
import fr.perrin.trains.reseau.CoordonneeLiteral;
import fr.perrin.trains.reseau.DeclarationPoint;
import fr.perrin.trains.reseau.Declared;
import fr.perrin.trains.reseau.Degree;
import fr.perrin.trains.reseau.Div;
import fr.perrin.trains.reseau.Est;
import fr.perrin.trains.reseau.Euler;
import fr.perrin.trains.reseau.I;
import fr.perrin.trains.reseau.Longueur;
import fr.perrin.trains.reseau.Minus;
import fr.perrin.trains.reseau.Model;
import fr.perrin.trains.reseau.Multi;
import fr.perrin.trains.reseau.Negative;
import fr.perrin.trains.reseau.Nord;
import fr.perrin.trains.reseau.NumberLiteral;
import fr.perrin.trains.reseau.Ouest;
import fr.perrin.trains.reseau.Pi;
import fr.perrin.trains.reseau.Plus;
import fr.perrin.trains.reseau.Pow;
import fr.perrin.trains.reseau.ReseauPackage;
import fr.perrin.trains.reseau.Segment;
import fr.perrin.trains.reseau.SegmentPart;
import fr.perrin.trains.reseau.Sud;
import fr.perrin.trains.reseau.Unidir;
import fr.perrin.trains.reseau.X;
import fr.perrin.trains.reseau.Y;
import fr.perrin.trains.services.ReseauGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ReseauSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ReseauGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ReseauPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ReseauPackage.ANGLE:
				sequence_PrimaryExpression(context, (Angle) semanticObject); 
				return; 
			case ReseauPackage.ARGUMENT:
				sequence_PrimaryExpression(context, (Argument) semanticObject); 
				return; 
			case ReseauPackage.BIDIR:
				sequence_Bidir(context, (Bidir) semanticObject); 
				return; 
			case ReseauPackage.COORDONNEE_LITERAL:
				sequence_PrimaryExpression(context, (CoordonneeLiteral) semanticObject); 
				return; 
			case ReseauPackage.DECLARATION_POINT:
				sequence_DeclarationPoint(context, (DeclarationPoint) semanticObject); 
				return; 
			case ReseauPackage.DECLARED:
				sequence_PrimaryExpression(context, (Declared) semanticObject); 
				return; 
			case ReseauPackage.DEGREE:
				sequence_Puissance(context, (Degree) semanticObject); 
				return; 
			case ReseauPackage.DIV:
				sequence_Multiplication(context, (Div) semanticObject); 
				return; 
			case ReseauPackage.EST:
				sequence_PrimaryExpression(context, (Est) semanticObject); 
				return; 
			case ReseauPackage.EULER:
				sequence_PrimaryExpression(context, (Euler) semanticObject); 
				return; 
			case ReseauPackage.I:
				sequence_PrimaryExpression(context, (I) semanticObject); 
				return; 
			case ReseauPackage.LONGUEUR:
				sequence_PrimaryExpression(context, (Longueur) semanticObject); 
				return; 
			case ReseauPackage.MINUS:
				sequence_Addition(context, (Minus) semanticObject); 
				return; 
			case ReseauPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case ReseauPackage.MULTI:
				sequence_Multiplication(context, (Multi) semanticObject); 
				return; 
			case ReseauPackage.NEGATIVE:
				sequence_PrimaryExpression(context, (Negative) semanticObject); 
				return; 
			case ReseauPackage.NORD:
				sequence_PrimaryExpression(context, (Nord) semanticObject); 
				return; 
			case ReseauPackage.NUMBER_LITERAL:
				sequence_PrimaryExpression(context, (NumberLiteral) semanticObject); 
				return; 
			case ReseauPackage.OUEST:
				sequence_PrimaryExpression(context, (Ouest) semanticObject); 
				return; 
			case ReseauPackage.PI:
				sequence_PrimaryExpression(context, (Pi) semanticObject); 
				return; 
			case ReseauPackage.PLUS:
				sequence_Addition(context, (Plus) semanticObject); 
				return; 
			case ReseauPackage.POW:
				sequence_Puissance(context, (Pow) semanticObject); 
				return; 
			case ReseauPackage.SEGMENT:
				sequence_Segment(context, (Segment) semanticObject); 
				return; 
			case ReseauPackage.SEGMENT_PART:
				sequence_SegmentPart(context, (SegmentPart) semanticObject); 
				return; 
			case ReseauPackage.SUD:
				sequence_PrimaryExpression(context, (Sud) semanticObject); 
				return; 
			case ReseauPackage.UNIDIR:
				sequence_Unidir(context, (Unidir) semanticObject); 
				return; 
			case ReseauPackage.X:
				sequence_PrimaryExpression(context, (X) semanticObject); 
				return; 
			case ReseauPackage.Y:
				sequence_PrimaryExpression(context, (Y) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Point returns Minus
	 *     Addition returns Minus
	 *     Addition.Plus_1_0_0_0 returns Minus
	 *     Addition.Minus_1_0_1_0 returns Minus
	 *     Multiplication returns Minus
	 *     Multiplication.Multi_1_0_0_0 returns Minus
	 *     Multiplication.Div_1_0_1_0 returns Minus
	 *     Puissance returns Minus
	 *     Puissance.Degree_1_0_0 returns Minus
	 *     Puissance.Pow_1_1_0 returns Minus
	 *     PrimaryExpression returns Minus
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns Minus
	 *
	 * Constraint:
	 *     (left=Addition_Minus_1_0_1_0 right=Multiplication)
	 */
	protected void sequence_Addition(ISerializationContext context, Minus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.MINUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.MINUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Plus
	 *     Addition returns Plus
	 *     Addition.Plus_1_0_0_0 returns Plus
	 *     Addition.Minus_1_0_1_0 returns Plus
	 *     Multiplication returns Plus
	 *     Multiplication.Multi_1_0_0_0 returns Plus
	 *     Multiplication.Div_1_0_1_0 returns Plus
	 *     Puissance returns Plus
	 *     Puissance.Degree_1_0_0 returns Plus
	 *     Puissance.Pow_1_1_0 returns Plus
	 *     PrimaryExpression returns Plus
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns Plus
	 *
	 * Constraint:
	 *     (left=Addition_Plus_1_0_0_0 right=Multiplication)
	 */
	protected void sequence_Addition(ISerializationContext context, Plus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.PLUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.PLUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Bidir returns Bidir
	 *
	 * Constraint:
	 *     pts+=Point+
	 */
	protected void sequence_Bidir(ISerializationContext context, Bidir semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DeclarationPoint returns DeclarationPoint
	 *
	 * Constraint:
	 *     (name=ID xy=Point)
	 */
	protected void sequence_DeclarationPoint(ISerializationContext context, DeclarationPoint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.DECLARATION_POINT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.DECLARATION_POINT__NAME));
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.DECLARATION_POINT__XY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.DECLARATION_POINT__XY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeclarationPointAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDeclarationPointAccess().getXyPointParserRuleCall_2_0(), semanticObject.getXy());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (segments+=Segment | pointsLiaison+=DeclarationPoint)+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Div
	 *     Addition returns Div
	 *     Addition.Plus_1_0_0_0 returns Div
	 *     Addition.Minus_1_0_1_0 returns Div
	 *     Multiplication returns Div
	 *     Multiplication.Multi_1_0_0_0 returns Div
	 *     Multiplication.Div_1_0_1_0 returns Div
	 *     Puissance returns Div
	 *     Puissance.Degree_1_0_0 returns Div
	 *     Puissance.Pow_1_1_0 returns Div
	 *     PrimaryExpression returns Div
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns Div
	 *
	 * Constraint:
	 *     (left=Multiplication_Div_1_0_1_0 right=Multiplication)
	 */
	protected void sequence_Multiplication(ISerializationContext context, Div semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.DIV__LEFT));
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.DIV__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Multi
	 *     Addition returns Multi
	 *     Addition.Plus_1_0_0_0 returns Multi
	 *     Addition.Minus_1_0_1_0 returns Multi
	 *     Multiplication returns Multi
	 *     Multiplication.Multi_1_0_0_0 returns Multi
	 *     Multiplication.Div_1_0_1_0 returns Multi
	 *     Puissance returns Multi
	 *     Puissance.Degree_1_0_0 returns Multi
	 *     Puissance.Pow_1_1_0 returns Multi
	 *     PrimaryExpression returns Multi
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns Multi
	 *
	 * Constraint:
	 *     (left=Multiplication_Multi_1_0_0_0 right=Multiplication)
	 */
	protected void sequence_Multiplication(ISerializationContext context, Multi semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.MULTI__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.MULTI__LEFT));
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.MULTI__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.MULTI__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Angle
	 *     Addition returns Angle
	 *     Addition.Plus_1_0_0_0 returns Angle
	 *     Addition.Minus_1_0_1_0 returns Angle
	 *     Multiplication returns Angle
	 *     Multiplication.Multi_1_0_0_0 returns Angle
	 *     Multiplication.Div_1_0_1_0 returns Angle
	 *     Puissance returns Angle
	 *     Puissance.Degree_1_0_0 returns Angle
	 *     Puissance.Pow_1_1_0 returns Angle
	 *     PrimaryExpression returns Angle
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns Angle
	 *
	 * Constraint:
	 *     value=Point
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, Angle semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.ANGLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.ANGLE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_14_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Argument
	 *     Addition returns Argument
	 *     Addition.Plus_1_0_0_0 returns Argument
	 *     Addition.Minus_1_0_1_0 returns Argument
	 *     Multiplication returns Argument
	 *     Multiplication.Multi_1_0_0_0 returns Argument
	 *     Multiplication.Div_1_0_1_0 returns Argument
	 *     Puissance returns Argument
	 *     Puissance.Degree_1_0_0 returns Argument
	 *     Puissance.Pow_1_1_0 returns Argument
	 *     PrimaryExpression returns Argument
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns Argument
	 *
	 * Constraint:
	 *     value=Point
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, Argument semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.ARGUMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.ARGUMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_15_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Point returns CoordonneeLiteral
	 *     Addition returns CoordonneeLiteral
	 *     Addition.Plus_1_0_0_0 returns CoordonneeLiteral
	 *     Addition.Minus_1_0_1_0 returns CoordonneeLiteral
	 *     Multiplication returns CoordonneeLiteral
	 *     Multiplication.Multi_1_0_0_0 returns CoordonneeLiteral
	 *     Multiplication.Div_1_0_1_0 returns CoordonneeLiteral
	 *     Puissance returns CoordonneeLiteral
	 *     Puissance.Degree_1_0_0 returns CoordonneeLiteral
	 *     Puissance.Pow_1_1_0 returns CoordonneeLiteral
	 *     PrimaryExpression returns CoordonneeLiteral
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns CoordonneeLiteral
	 *
	 * Constraint:
	 *     (left=PrimaryExpression_CoordonneeLiteral_0_2_0 right=Point)
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, CoordonneeLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.COORDONNEE_LITERAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.COORDONNEE_LITERAL__LEFT));
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.COORDONNEE_LITERAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.COORDONNEE_LITERAL__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getCoordonneeLiteralLeftAction_0_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getRightPointParserRuleCall_0_2_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Declared
	 *     Addition returns Declared
	 *     Addition.Plus_1_0_0_0 returns Declared
	 *     Addition.Minus_1_0_1_0 returns Declared
	 *     Multiplication returns Declared
	 *     Multiplication.Multi_1_0_0_0 returns Declared
	 *     Multiplication.Div_1_0_1_0 returns Declared
	 *     Puissance returns Declared
	 *     Puissance.Degree_1_0_0 returns Declared
	 *     Puissance.Pow_1_1_0 returns Declared
	 *     PrimaryExpression returns Declared
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns Declared
	 *
	 * Constraint:
	 *     Decl=[DeclarationPoint|ID]
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, Declared semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.DECLARED__DECL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.DECLARED__DECL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getDeclDeclarationPointIDTerminalRuleCall_3_1_0_1(), semanticObject.eGet(ReseauPackage.Literals.DECLARED__DECL, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Est
	 *     Addition returns Est
	 *     Addition.Plus_1_0_0_0 returns Est
	 *     Addition.Minus_1_0_1_0 returns Est
	 *     Multiplication returns Est
	 *     Multiplication.Multi_1_0_0_0 returns Est
	 *     Multiplication.Div_1_0_1_0 returns Est
	 *     Puissance returns Est
	 *     Puissance.Degree_1_0_0 returns Est
	 *     Puissance.Pow_1_1_0 returns Est
	 *     PrimaryExpression returns Est
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns Est
	 *
	 * Constraint:
	 *     {Est}
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, Est semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Euler
	 *     Addition returns Euler
	 *     Addition.Plus_1_0_0_0 returns Euler
	 *     Addition.Minus_1_0_1_0 returns Euler
	 *     Multiplication returns Euler
	 *     Multiplication.Multi_1_0_0_0 returns Euler
	 *     Multiplication.Div_1_0_1_0 returns Euler
	 *     Puissance returns Euler
	 *     Puissance.Degree_1_0_0 returns Euler
	 *     Puissance.Pow_1_1_0 returns Euler
	 *     PrimaryExpression returns Euler
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns Euler
	 *
	 * Constraint:
	 *     {Euler}
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, Euler semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Point returns I
	 *     Addition returns I
	 *     Addition.Plus_1_0_0_0 returns I
	 *     Addition.Minus_1_0_1_0 returns I
	 *     Multiplication returns I
	 *     Multiplication.Multi_1_0_0_0 returns I
	 *     Multiplication.Div_1_0_1_0 returns I
	 *     Puissance returns I
	 *     Puissance.Degree_1_0_0 returns I
	 *     Puissance.Pow_1_1_0 returns I
	 *     PrimaryExpression returns I
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns I
	 *
	 * Constraint:
	 *     {I}
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, I semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Longueur
	 *     Addition returns Longueur
	 *     Addition.Plus_1_0_0_0 returns Longueur
	 *     Addition.Minus_1_0_1_0 returns Longueur
	 *     Multiplication returns Longueur
	 *     Multiplication.Multi_1_0_0_0 returns Longueur
	 *     Multiplication.Div_1_0_1_0 returns Longueur
	 *     Puissance returns Longueur
	 *     Puissance.Degree_1_0_0 returns Longueur
	 *     Puissance.Pow_1_1_0 returns Longueur
	 *     PrimaryExpression returns Longueur
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns Longueur
	 *
	 * Constraint:
	 *     value=Point
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, Longueur semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.LONGUEUR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.LONGUEUR__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_13_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Negative
	 *     Addition returns Negative
	 *     Addition.Plus_1_0_0_0 returns Negative
	 *     Addition.Minus_1_0_1_0 returns Negative
	 *     Multiplication returns Negative
	 *     Multiplication.Multi_1_0_0_0 returns Negative
	 *     Multiplication.Div_1_0_1_0 returns Negative
	 *     Puissance returns Negative
	 *     Puissance.Degree_1_0_0 returns Negative
	 *     Puissance.Pow_1_1_0 returns Negative
	 *     PrimaryExpression returns Negative
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns Negative
	 *
	 * Constraint:
	 *     value=PrimaryExpression
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, Negative semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.NEGATIVE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.NEGATIVE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValuePrimaryExpressionParserRuleCall_2_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Nord
	 *     Addition returns Nord
	 *     Addition.Plus_1_0_0_0 returns Nord
	 *     Addition.Minus_1_0_1_0 returns Nord
	 *     Multiplication returns Nord
	 *     Multiplication.Multi_1_0_0_0 returns Nord
	 *     Multiplication.Div_1_0_1_0 returns Nord
	 *     Puissance returns Nord
	 *     Puissance.Degree_1_0_0 returns Nord
	 *     Puissance.Pow_1_1_0 returns Nord
	 *     PrimaryExpression returns Nord
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns Nord
	 *
	 * Constraint:
	 *     {Nord}
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, Nord semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Point returns NumberLiteral
	 *     Addition returns NumberLiteral
	 *     Addition.Plus_1_0_0_0 returns NumberLiteral
	 *     Addition.Minus_1_0_1_0 returns NumberLiteral
	 *     Multiplication returns NumberLiteral
	 *     Multiplication.Multi_1_0_0_0 returns NumberLiteral
	 *     Multiplication.Div_1_0_1_0 returns NumberLiteral
	 *     Puissance returns NumberLiteral
	 *     Puissance.Degree_1_0_0 returns NumberLiteral
	 *     Puissance.Pow_1_1_0 returns NumberLiteral
	 *     PrimaryExpression returns NumberLiteral
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns NumberLiteral
	 *
	 * Constraint:
	 *     value=NUMBER
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, NumberLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.NUMBER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.NUMBER_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Ouest
	 *     Addition returns Ouest
	 *     Addition.Plus_1_0_0_0 returns Ouest
	 *     Addition.Minus_1_0_1_0 returns Ouest
	 *     Multiplication returns Ouest
	 *     Multiplication.Multi_1_0_0_0 returns Ouest
	 *     Multiplication.Div_1_0_1_0 returns Ouest
	 *     Puissance returns Ouest
	 *     Puissance.Degree_1_0_0 returns Ouest
	 *     Puissance.Pow_1_1_0 returns Ouest
	 *     PrimaryExpression returns Ouest
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns Ouest
	 *
	 * Constraint:
	 *     {Ouest}
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, Ouest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Pi
	 *     Addition returns Pi
	 *     Addition.Plus_1_0_0_0 returns Pi
	 *     Addition.Minus_1_0_1_0 returns Pi
	 *     Multiplication returns Pi
	 *     Multiplication.Multi_1_0_0_0 returns Pi
	 *     Multiplication.Div_1_0_1_0 returns Pi
	 *     Puissance returns Pi
	 *     Puissance.Degree_1_0_0 returns Pi
	 *     Puissance.Pow_1_1_0 returns Pi
	 *     PrimaryExpression returns Pi
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns Pi
	 *
	 * Constraint:
	 *     {Pi}
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, Pi semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Sud
	 *     Addition returns Sud
	 *     Addition.Plus_1_0_0_0 returns Sud
	 *     Addition.Minus_1_0_1_0 returns Sud
	 *     Multiplication returns Sud
	 *     Multiplication.Multi_1_0_0_0 returns Sud
	 *     Multiplication.Div_1_0_1_0 returns Sud
	 *     Puissance returns Sud
	 *     Puissance.Degree_1_0_0 returns Sud
	 *     Puissance.Pow_1_1_0 returns Sud
	 *     PrimaryExpression returns Sud
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns Sud
	 *
	 * Constraint:
	 *     {Sud}
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, Sud semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Point returns X
	 *     Addition returns X
	 *     Addition.Plus_1_0_0_0 returns X
	 *     Addition.Minus_1_0_1_0 returns X
	 *     Multiplication returns X
	 *     Multiplication.Multi_1_0_0_0 returns X
	 *     Multiplication.Div_1_0_1_0 returns X
	 *     Puissance returns X
	 *     Puissance.Degree_1_0_0 returns X
	 *     Puissance.Pow_1_1_0 returns X
	 *     PrimaryExpression returns X
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns X
	 *
	 * Constraint:
	 *     value=Point
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, X semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.X__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.X__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_11_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Y
	 *     Addition returns Y
	 *     Addition.Plus_1_0_0_0 returns Y
	 *     Addition.Minus_1_0_1_0 returns Y
	 *     Multiplication returns Y
	 *     Multiplication.Multi_1_0_0_0 returns Y
	 *     Multiplication.Div_1_0_1_0 returns Y
	 *     Puissance returns Y
	 *     Puissance.Degree_1_0_0 returns Y
	 *     Puissance.Pow_1_1_0 returns Y
	 *     PrimaryExpression returns Y
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns Y
	 *
	 * Constraint:
	 *     value=Point
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, Y semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.Y__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.Y__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_12_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Degree
	 *     Addition returns Degree
	 *     Addition.Plus_1_0_0_0 returns Degree
	 *     Addition.Minus_1_0_1_0 returns Degree
	 *     Multiplication returns Degree
	 *     Multiplication.Multi_1_0_0_0 returns Degree
	 *     Multiplication.Div_1_0_1_0 returns Degree
	 *     Puissance returns Degree
	 *     Puissance.Degree_1_0_0 returns Degree
	 *     Puissance.Pow_1_1_0 returns Degree
	 *     PrimaryExpression returns Degree
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns Degree
	 *
	 * Constraint:
	 *     left=Puissance_Degree_1_0_0
	 */
	protected void sequence_Puissance(ISerializationContext context, Degree semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.DEGREE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.DEGREE__LEFT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPuissanceAccess().getDegreeLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Pow
	 *     Addition returns Pow
	 *     Addition.Plus_1_0_0_0 returns Pow
	 *     Addition.Minus_1_0_1_0 returns Pow
	 *     Multiplication returns Pow
	 *     Multiplication.Multi_1_0_0_0 returns Pow
	 *     Multiplication.Div_1_0_1_0 returns Pow
	 *     Puissance returns Pow
	 *     Puissance.Degree_1_0_0 returns Pow
	 *     Puissance.Pow_1_1_0 returns Pow
	 *     PrimaryExpression returns Pow
	 *     PrimaryExpression.CoordonneeLiteral_0_2_0 returns Pow
	 *
	 * Constraint:
	 *     (left=Puissance_Pow_1_1_0 right=PrimaryExpression)
	 */
	protected void sequence_Puissance(ISerializationContext context, Pow semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.POW__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.POW__LEFT));
			if (transientValues.isValueTransient(semanticObject, ReseauPackage.Literals.POW__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReseauPackage.Literals.POW__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPuissanceAccess().getPowLeftAction_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPuissanceAccess().getRightPrimaryExpressionParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SegmentPart returns SegmentPart
	 *
	 * Constraint:
	 *     (fst=Point (next=Unidir | next=Bidir))
	 */
	protected void sequence_SegmentPart(ISerializationContext context, SegmentPart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Segment returns Segment
	 *
	 * Constraint:
	 *     (name=ID parts+=SegmentPart+)
	 */
	protected void sequence_Segment(ISerializationContext context, Segment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Unidir returns Unidir
	 *
	 * Constraint:
	 *     pts+=Point+
	 */
	protected void sequence_Unidir(ISerializationContext context, Unidir semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}