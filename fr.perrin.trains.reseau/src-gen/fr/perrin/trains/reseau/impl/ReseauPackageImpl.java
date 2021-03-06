/**
 * generated by Xtext 2.20.0
 */
package fr.perrin.trains.reseau.impl;

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
import fr.perrin.trains.reseau.Point;
import fr.perrin.trains.reseau.Pow;
import fr.perrin.trains.reseau.ReseauFactory;
import fr.perrin.trains.reseau.ReseauPackage;
import fr.perrin.trains.reseau.Segment;
import fr.perrin.trains.reseau.SegmentPart;
import fr.perrin.trains.reseau.Sud;
import fr.perrin.trains.reseau.Unidir;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReseauPackageImpl extends EPackageImpl implements ReseauPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationPointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass segmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass segmentPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unidirEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bidirEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass degreeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass powEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass coordonneeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negativeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declaredEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nordEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sudEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass estEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ouestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass piEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eulerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass yEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass longueurEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass angleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.perrin.trains.reseau.ReseauPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ReseauPackageImpl()
  {
    super(eNS_URI, ReseauFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link ReseauPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ReseauPackage init()
  {
    if (isInited) return (ReseauPackage)EPackage.Registry.INSTANCE.getEPackage(ReseauPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredReseauPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    ReseauPackageImpl theReseauPackage = registeredReseauPackage instanceof ReseauPackageImpl ? (ReseauPackageImpl)registeredReseauPackage : new ReseauPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theReseauPackage.createPackageContents();

    // Initialize created meta-data
    theReseauPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theReseauPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ReseauPackage.eNS_URI, theReseauPackage);
    return theReseauPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Segments()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_PointsLiaison()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDeclarationPoint()
  {
    return declarationPointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDeclarationPoint_Name()
  {
    return (EAttribute)declarationPointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDeclarationPoint_Xy()
  {
    return (EReference)declarationPointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPoint()
  {
    return pointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSegment()
  {
    return segmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSegment_Name()
  {
    return (EAttribute)segmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSegment_Parts()
  {
    return (EReference)segmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSegmentPart()
  {
    return segmentPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSegmentPart_Fst()
  {
    return (EReference)segmentPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSegmentPart_Next()
  {
    return (EReference)segmentPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnidir()
  {
    return unidirEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUnidir_Pts()
  {
    return (EReference)unidirEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBidir()
  {
    return bidirEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getBidir_Pts()
  {
    return (EReference)bidirEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPlus()
  {
    return plusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPlus_Left()
  {
    return (EReference)plusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPlus_Right()
  {
    return (EReference)plusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMinus()
  {
    return minusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMinus_Left()
  {
    return (EReference)minusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMinus_Right()
  {
    return (EReference)minusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMulti()
  {
    return multiEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMulti_Left()
  {
    return (EReference)multiEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMulti_Right()
  {
    return (EReference)multiEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDiv()
  {
    return divEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDiv_Left()
  {
    return (EReference)divEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDiv_Right()
  {
    return (EReference)divEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDegree()
  {
    return degreeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDegree_Left()
  {
    return (EReference)degreeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPow()
  {
    return powEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPow_Left()
  {
    return (EReference)powEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPow_Right()
  {
    return (EReference)powEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCoordonneeLiteral()
  {
    return coordonneeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCoordonneeLiteral_Left()
  {
    return (EReference)coordonneeLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCoordonneeLiteral_Right()
  {
    return (EReference)coordonneeLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNumberLiteral()
  {
    return numberLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getNumberLiteral_Value()
  {
    return (EAttribute)numberLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNegative()
  {
    return negativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNegative_Value()
  {
    return (EReference)negativeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDeclared()
  {
    return declaredEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDeclared_Decl()
  {
    return (EReference)declaredEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNord()
  {
    return nordEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSud()
  {
    return sudEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEst()
  {
    return estEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOuest()
  {
    return ouestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPi()
  {
    return piEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEuler()
  {
    return eulerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getI()
  {
    return iEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getX()
  {
    return xEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getX_Value()
  {
    return (EReference)xEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getY()
  {
    return yEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getY_Value()
  {
    return (EReference)yEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLongueur()
  {
    return longueurEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLongueur_Value()
  {
    return (EReference)longueurEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAngle()
  {
    return angleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAngle_Value()
  {
    return (EReference)angleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getArgument()
  {
    return argumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getArgument_Value()
  {
    return (EReference)argumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReseauFactory getReseauFactory()
  {
    return (ReseauFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__SEGMENTS);
    createEReference(modelEClass, MODEL__POINTS_LIAISON);

    declarationPointEClass = createEClass(DECLARATION_POINT);
    createEAttribute(declarationPointEClass, DECLARATION_POINT__NAME);
    createEReference(declarationPointEClass, DECLARATION_POINT__XY);

    pointEClass = createEClass(POINT);

    segmentEClass = createEClass(SEGMENT);
    createEAttribute(segmentEClass, SEGMENT__NAME);
    createEReference(segmentEClass, SEGMENT__PARTS);

    segmentPartEClass = createEClass(SEGMENT_PART);
    createEReference(segmentPartEClass, SEGMENT_PART__FST);
    createEReference(segmentPartEClass, SEGMENT_PART__NEXT);

    unidirEClass = createEClass(UNIDIR);
    createEReference(unidirEClass, UNIDIR__PTS);

    bidirEClass = createEClass(BIDIR);
    createEReference(bidirEClass, BIDIR__PTS);

    plusEClass = createEClass(PLUS);
    createEReference(plusEClass, PLUS__LEFT);
    createEReference(plusEClass, PLUS__RIGHT);

    minusEClass = createEClass(MINUS);
    createEReference(minusEClass, MINUS__LEFT);
    createEReference(minusEClass, MINUS__RIGHT);

    multiEClass = createEClass(MULTI);
    createEReference(multiEClass, MULTI__LEFT);
    createEReference(multiEClass, MULTI__RIGHT);

    divEClass = createEClass(DIV);
    createEReference(divEClass, DIV__LEFT);
    createEReference(divEClass, DIV__RIGHT);

    degreeEClass = createEClass(DEGREE);
    createEReference(degreeEClass, DEGREE__LEFT);

    powEClass = createEClass(POW);
    createEReference(powEClass, POW__LEFT);
    createEReference(powEClass, POW__RIGHT);

    coordonneeLiteralEClass = createEClass(COORDONNEE_LITERAL);
    createEReference(coordonneeLiteralEClass, COORDONNEE_LITERAL__LEFT);
    createEReference(coordonneeLiteralEClass, COORDONNEE_LITERAL__RIGHT);

    numberLiteralEClass = createEClass(NUMBER_LITERAL);
    createEAttribute(numberLiteralEClass, NUMBER_LITERAL__VALUE);

    negativeEClass = createEClass(NEGATIVE);
    createEReference(negativeEClass, NEGATIVE__VALUE);

    declaredEClass = createEClass(DECLARED);
    createEReference(declaredEClass, DECLARED__DECL);

    nordEClass = createEClass(NORD);

    sudEClass = createEClass(SUD);

    estEClass = createEClass(EST);

    ouestEClass = createEClass(OUEST);

    piEClass = createEClass(PI);

    eulerEClass = createEClass(EULER);

    iEClass = createEClass(I);

    xEClass = createEClass(X);
    createEReference(xEClass, X__VALUE);

    yEClass = createEClass(Y);
    createEReference(yEClass, Y__VALUE);

    longueurEClass = createEClass(LONGUEUR);
    createEReference(longueurEClass, LONGUEUR__VALUE);

    angleEClass = createEClass(ANGLE);
    createEReference(angleEClass, ANGLE__VALUE);

    argumentEClass = createEClass(ARGUMENT);
    createEReference(argumentEClass, ARGUMENT__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    plusEClass.getESuperTypes().add(this.getPoint());
    minusEClass.getESuperTypes().add(this.getPoint());
    multiEClass.getESuperTypes().add(this.getPoint());
    divEClass.getESuperTypes().add(this.getPoint());
    degreeEClass.getESuperTypes().add(this.getPoint());
    powEClass.getESuperTypes().add(this.getPoint());
    coordonneeLiteralEClass.getESuperTypes().add(this.getPoint());
    numberLiteralEClass.getESuperTypes().add(this.getPoint());
    negativeEClass.getESuperTypes().add(this.getPoint());
    declaredEClass.getESuperTypes().add(this.getPoint());
    nordEClass.getESuperTypes().add(this.getPoint());
    sudEClass.getESuperTypes().add(this.getPoint());
    estEClass.getESuperTypes().add(this.getPoint());
    ouestEClass.getESuperTypes().add(this.getPoint());
    piEClass.getESuperTypes().add(this.getPoint());
    eulerEClass.getESuperTypes().add(this.getPoint());
    iEClass.getESuperTypes().add(this.getPoint());
    xEClass.getESuperTypes().add(this.getPoint());
    yEClass.getESuperTypes().add(this.getPoint());
    longueurEClass.getESuperTypes().add(this.getPoint());
    angleEClass.getESuperTypes().add(this.getPoint());
    argumentEClass.getESuperTypes().add(this.getPoint());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Segments(), this.getSegment(), null, "segments", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_PointsLiaison(), this.getDeclarationPoint(), null, "pointsLiaison", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationPointEClass, DeclarationPoint.class, "DeclarationPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeclarationPoint_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeclarationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeclarationPoint_Xy(), this.getPoint(), null, "xy", null, 0, 1, DeclarationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(segmentEClass, Segment.class, "Segment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSegment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Segment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSegment_Parts(), this.getSegmentPart(), null, "parts", null, 0, -1, Segment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(segmentPartEClass, SegmentPart.class, "SegmentPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSegmentPart_Fst(), this.getPoint(), null, "fst", null, 0, 1, SegmentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSegmentPart_Next(), ecorePackage.getEObject(), null, "next", null, 0, 1, SegmentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unidirEClass, Unidir.class, "Unidir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnidir_Pts(), this.getPoint(), null, "pts", null, 0, -1, Unidir.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bidirEClass, Bidir.class, "Bidir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBidir_Pts(), this.getPoint(), null, "pts", null, 0, -1, Bidir.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlus_Left(), this.getPoint(), null, "left", null, 0, 1, Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlus_Right(), this.getPoint(), null, "right", null, 0, 1, Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMinus_Left(), this.getPoint(), null, "left", null, 0, 1, Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMinus_Right(), this.getPoint(), null, "right", null, 0, 1, Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiEClass, Multi.class, "Multi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMulti_Left(), this.getPoint(), null, "left", null, 0, 1, Multi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMulti_Right(), this.getPoint(), null, "right", null, 0, 1, Multi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(divEClass, Div.class, "Div", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDiv_Left(), this.getPoint(), null, "left", null, 0, 1, Div.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiv_Right(), this.getPoint(), null, "right", null, 0, 1, Div.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(degreeEClass, Degree.class, "Degree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDegree_Left(), this.getPoint(), null, "left", null, 0, 1, Degree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(powEClass, Pow.class, "Pow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPow_Left(), this.getPoint(), null, "left", null, 0, 1, Pow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPow_Right(), this.getPoint(), null, "right", null, 0, 1, Pow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(coordonneeLiteralEClass, CoordonneeLiteral.class, "CoordonneeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCoordonneeLiteral_Left(), this.getPoint(), null, "left", null, 0, 1, CoordonneeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCoordonneeLiteral_Right(), this.getPoint(), null, "right", null, 0, 1, CoordonneeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberLiteralEClass, NumberLiteral.class, "NumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumberLiteral_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, NumberLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(negativeEClass, Negative.class, "Negative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNegative_Value(), this.getPoint(), null, "value", null, 0, 1, Negative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declaredEClass, Declared.class, "Declared", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclared_Decl(), this.getDeclarationPoint(), null, "Decl", null, 0, 1, Declared.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nordEClass, Nord.class, "Nord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sudEClass, Sud.class, "Sud", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(estEClass, Est.class, "Est", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ouestEClass, Ouest.class, "Ouest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(piEClass, Pi.class, "Pi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eulerEClass, Euler.class, "Euler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(iEClass, fr.perrin.trains.reseau.I.class, "I", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xEClass, fr.perrin.trains.reseau.X.class, "X", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getX_Value(), this.getPoint(), null, "value", null, 0, 1, fr.perrin.trains.reseau.X.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(yEClass, fr.perrin.trains.reseau.Y.class, "Y", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getY_Value(), this.getPoint(), null, "value", null, 0, 1, fr.perrin.trains.reseau.Y.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(longueurEClass, Longueur.class, "Longueur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLongueur_Value(), this.getPoint(), null, "value", null, 0, 1, Longueur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(angleEClass, Angle.class, "Angle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAngle_Value(), this.getPoint(), null, "value", null, 0, 1, Angle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArgument_Value(), this.getPoint(), null, "value", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ReseauPackageImpl
