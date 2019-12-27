/**
 * generated by Xtext 2.20.0
 */
package fr.perrin.trains.reseau;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.perrin.trains.reseau.Plus#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.perrin.trains.reseau.Plus#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see fr.perrin.trains.reseau.ReseauPackage#getPlus()
 * @model
 * @generated
 */
public interface Plus extends Point
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Point)
   * @see fr.perrin.trains.reseau.ReseauPackage#getPlus_Left()
   * @model containment="true"
   * @generated
   */
  Point getLeft();

  /**
   * Sets the value of the '{@link fr.perrin.trains.reseau.Plus#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Point value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Point)
   * @see fr.perrin.trains.reseau.ReseauPackage#getPlus_Right()
   * @model containment="true"
   * @generated
   */
  Point getRight();

  /**
   * Sets the value of the '{@link fr.perrin.trains.reseau.Plus#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Point value);

} // Plus
