/**
 * generated by Xtext 2.20.0
 */
package fr.perrin.trains.reseau;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.perrin.trains.reseau.DeclarationPoint#getName <em>Name</em>}</li>
 *   <li>{@link fr.perrin.trains.reseau.DeclarationPoint#getXy <em>Xy</em>}</li>
 * </ul>
 *
 * @see fr.perrin.trains.reseau.ReseauPackage#getDeclarationPoint()
 * @model
 * @generated
 */
public interface DeclarationPoint extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.perrin.trains.reseau.ReseauPackage#getDeclarationPoint_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.perrin.trains.reseau.DeclarationPoint#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Xy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xy</em>' containment reference.
   * @see #setXy(Point)
   * @see fr.perrin.trains.reseau.ReseauPackage#getDeclarationPoint_Xy()
   * @model containment="true"
   * @generated
   */
  Point getXy();

  /**
   * Sets the value of the '{@link fr.perrin.trains.reseau.DeclarationPoint#getXy <em>Xy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xy</em>' containment reference.
   * @see #getXy()
   * @generated
   */
  void setXy(Point value);

} // DeclarationPoint
