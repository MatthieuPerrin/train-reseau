/**
 * generated by Xtext 2.20.0
 */
package fr.perrin.trains.reseau.util;

import fr.perrin.trains.reseau.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.perrin.trains.reseau.ReseauPackage
 * @generated
 */
public class ReseauAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ReseauPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReseauAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ReseauPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReseauSwitch<Adapter> modelSwitch =
    new ReseauSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseDeclarationPoint(DeclarationPoint object)
      {
        return createDeclarationPointAdapter();
      }
      @Override
      public Adapter casePoint(Point object)
      {
        return createPointAdapter();
      }
      @Override
      public Adapter caseSegment(Segment object)
      {
        return createSegmentAdapter();
      }
      @Override
      public Adapter caseSegmentPart(SegmentPart object)
      {
        return createSegmentPartAdapter();
      }
      @Override
      public Adapter caseUnidir(Unidir object)
      {
        return createUnidirAdapter();
      }
      @Override
      public Adapter caseBidir(Bidir object)
      {
        return createBidirAdapter();
      }
      @Override
      public Adapter casePlus(Plus object)
      {
        return createPlusAdapter();
      }
      @Override
      public Adapter caseMinus(Minus object)
      {
        return createMinusAdapter();
      }
      @Override
      public Adapter caseMulti(Multi object)
      {
        return createMultiAdapter();
      }
      @Override
      public Adapter caseDiv(Div object)
      {
        return createDivAdapter();
      }
      @Override
      public Adapter caseDegree(Degree object)
      {
        return createDegreeAdapter();
      }
      @Override
      public Adapter casePow(Pow object)
      {
        return createPowAdapter();
      }
      @Override
      public Adapter caseCoordonneeLiteral(CoordonneeLiteral object)
      {
        return createCoordonneeLiteralAdapter();
      }
      @Override
      public Adapter caseNumberLiteral(NumberLiteral object)
      {
        return createNumberLiteralAdapter();
      }
      @Override
      public Adapter caseNegative(Negative object)
      {
        return createNegativeAdapter();
      }
      @Override
      public Adapter caseDeclared(Declared object)
      {
        return createDeclaredAdapter();
      }
      @Override
      public Adapter caseNord(Nord object)
      {
        return createNordAdapter();
      }
      @Override
      public Adapter caseSud(Sud object)
      {
        return createSudAdapter();
      }
      @Override
      public Adapter caseEst(Est object)
      {
        return createEstAdapter();
      }
      @Override
      public Adapter caseOuest(Ouest object)
      {
        return createOuestAdapter();
      }
      @Override
      public Adapter casePi(Pi object)
      {
        return createPiAdapter();
      }
      @Override
      public Adapter caseEuler(Euler object)
      {
        return createEulerAdapter();
      }
      @Override
      public Adapter caseI(I object)
      {
        return createIAdapter();
      }
      @Override
      public Adapter caseX(X object)
      {
        return createXAdapter();
      }
      @Override
      public Adapter caseY(Y object)
      {
        return createYAdapter();
      }
      @Override
      public Adapter caseLongueur(Longueur object)
      {
        return createLongueurAdapter();
      }
      @Override
      public Adapter caseAngle(Angle object)
      {
        return createAngleAdapter();
      }
      @Override
      public Adapter caseArgument(Argument object)
      {
        return createArgumentAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.DeclarationPoint <em>Declaration Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.DeclarationPoint
   * @generated
   */
  public Adapter createDeclarationPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Point
   * @generated
   */
  public Adapter createPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Segment <em>Segment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Segment
   * @generated
   */
  public Adapter createSegmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.SegmentPart <em>Segment Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.SegmentPart
   * @generated
   */
  public Adapter createSegmentPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Unidir <em>Unidir</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Unidir
   * @generated
   */
  public Adapter createUnidirAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Bidir <em>Bidir</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Bidir
   * @generated
   */
  public Adapter createBidirAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Plus
   * @generated
   */
  public Adapter createPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Minus
   * @generated
   */
  public Adapter createMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Multi
   * @generated
   */
  public Adapter createMultiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Div
   * @generated
   */
  public Adapter createDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Degree <em>Degree</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Degree
   * @generated
   */
  public Adapter createDegreeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Pow <em>Pow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Pow
   * @generated
   */
  public Adapter createPowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.CoordonneeLiteral <em>Coordonnee Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.CoordonneeLiteral
   * @generated
   */
  public Adapter createCoordonneeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.NumberLiteral
   * @generated
   */
  public Adapter createNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Negative <em>Negative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Negative
   * @generated
   */
  public Adapter createNegativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Declared <em>Declared</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Declared
   * @generated
   */
  public Adapter createDeclaredAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Nord <em>Nord</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Nord
   * @generated
   */
  public Adapter createNordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Sud <em>Sud</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Sud
   * @generated
   */
  public Adapter createSudAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Est <em>Est</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Est
   * @generated
   */
  public Adapter createEstAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Ouest <em>Ouest</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Ouest
   * @generated
   */
  public Adapter createOuestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Pi <em>Pi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Pi
   * @generated
   */
  public Adapter createPiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Euler <em>Euler</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Euler
   * @generated
   */
  public Adapter createEulerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.I <em>I</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.I
   * @generated
   */
  public Adapter createIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.X <em>X</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.X
   * @generated
   */
  public Adapter createXAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Y <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Y
   * @generated
   */
  public Adapter createYAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Longueur <em>Longueur</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Longueur
   * @generated
   */
  public Adapter createLongueurAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Angle <em>Angle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Angle
   * @generated
   */
  public Adapter createAngleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.perrin.trains.reseau.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.perrin.trains.reseau.Argument
   * @generated
   */
  public Adapter createArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ReseauAdapterFactory
