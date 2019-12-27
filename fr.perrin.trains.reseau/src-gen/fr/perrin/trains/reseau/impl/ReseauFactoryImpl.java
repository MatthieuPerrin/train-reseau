/**
 * generated by Xtext 2.20.0
 */
package fr.perrin.trains.reseau.impl;

import fr.perrin.trains.reseau.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReseauFactoryImpl extends EFactoryImpl implements ReseauFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ReseauFactory init()
  {
    try
    {
      ReseauFactory theReseauFactory = (ReseauFactory)EPackage.Registry.INSTANCE.getEFactory(ReseauPackage.eNS_URI);
      if (theReseauFactory != null)
      {
        return theReseauFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ReseauFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReseauFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ReseauPackage.MODEL: return createModel();
      case ReseauPackage.DECLARATION_POINT: return createDeclarationPoint();
      case ReseauPackage.POINT: return createPoint();
      case ReseauPackage.SEGMENT: return createSegment();
      case ReseauPackage.SEGMENT_PART: return createSegmentPart();
      case ReseauPackage.UNIDIR: return createUnidir();
      case ReseauPackage.BIDIR: return createBidir();
      case ReseauPackage.PLUS: return createPlus();
      case ReseauPackage.MINUS: return createMinus();
      case ReseauPackage.MULTI: return createMulti();
      case ReseauPackage.DIV: return createDiv();
      case ReseauPackage.DEGREE: return createDegree();
      case ReseauPackage.POW: return createPow();
      case ReseauPackage.COORDONNEE_LITERAL: return createCoordonneeLiteral();
      case ReseauPackage.NUMBER_LITERAL: return createNumberLiteral();
      case ReseauPackage.NEGATIVE: return createNegative();
      case ReseauPackage.DECLARED: return createDeclared();
      case ReseauPackage.NORD: return createNord();
      case ReseauPackage.SUD: return createSud();
      case ReseauPackage.EST: return createEst();
      case ReseauPackage.OUEST: return createOuest();
      case ReseauPackage.PI: return createPi();
      case ReseauPackage.EULER: return createEuler();
      case ReseauPackage.I: return createI();
      case ReseauPackage.X: return createX();
      case ReseauPackage.Y: return createY();
      case ReseauPackage.LONGUEUR: return createLongueur();
      case ReseauPackage.ANGLE: return createAngle();
      case ReseauPackage.ARGUMENT: return createArgument();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeclarationPoint createDeclarationPoint()
  {
    DeclarationPointImpl declarationPoint = new DeclarationPointImpl();
    return declarationPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Point createPoint()
  {
    PointImpl point = new PointImpl();
    return point;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Segment createSegment()
  {
    SegmentImpl segment = new SegmentImpl();
    return segment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SegmentPart createSegmentPart()
  {
    SegmentPartImpl segmentPart = new SegmentPartImpl();
    return segmentPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Unidir createUnidir()
  {
    UnidirImpl unidir = new UnidirImpl();
    return unidir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Bidir createBidir()
  {
    BidirImpl bidir = new BidirImpl();
    return bidir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Multi createMulti()
  {
    MultiImpl multi = new MultiImpl();
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Degree createDegree()
  {
    DegreeImpl degree = new DegreeImpl();
    return degree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pow createPow()
  {
    PowImpl pow = new PowImpl();
    return pow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CoordonneeLiteral createCoordonneeLiteral()
  {
    CoordonneeLiteralImpl coordonneeLiteral = new CoordonneeLiteralImpl();
    return coordonneeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Negative createNegative()
  {
    NegativeImpl negative = new NegativeImpl();
    return negative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Declared createDeclared()
  {
    DeclaredImpl declared = new DeclaredImpl();
    return declared;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Nord createNord()
  {
    NordImpl nord = new NordImpl();
    return nord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sud createSud()
  {
    SudImpl sud = new SudImpl();
    return sud;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Est createEst()
  {
    EstImpl est = new EstImpl();
    return est;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ouest createOuest()
  {
    OuestImpl ouest = new OuestImpl();
    return ouest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pi createPi()
  {
    PiImpl pi = new PiImpl();
    return pi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Euler createEuler()
  {
    EulerImpl euler = new EulerImpl();
    return euler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public I createI()
  {
    IImpl i = new IImpl();
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public X createX()
  {
    XImpl x = new XImpl();
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Y createY()
  {
    YImpl y = new YImpl();
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Longueur createLongueur()
  {
    LongueurImpl longueur = new LongueurImpl();
    return longueur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Angle createAngle()
  {
    AngleImpl angle = new AngleImpl();
    return angle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReseauPackage getReseauPackage()
  {
    return (ReseauPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ReseauPackage getPackage()
  {
    return ReseauPackage.eINSTANCE;
  }

} //ReseauFactoryImpl