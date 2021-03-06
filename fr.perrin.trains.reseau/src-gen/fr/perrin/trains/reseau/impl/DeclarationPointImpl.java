/**
 * generated by Xtext 2.20.0
 */
package fr.perrin.trains.reseau.impl;

import fr.perrin.trains.reseau.DeclarationPoint;
import fr.perrin.trains.reseau.Point;
import fr.perrin.trains.reseau.ReseauPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.perrin.trains.reseau.impl.DeclarationPointImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.perrin.trains.reseau.impl.DeclarationPointImpl#getXy <em>Xy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarationPointImpl extends MinimalEObjectImpl.Container implements DeclarationPoint
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getXy() <em>Xy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXy()
   * @generated
   * @ordered
   */
  protected Point xy;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarationPointImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ReseauPackage.Literals.DECLARATION_POINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReseauPackage.DECLARATION_POINT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Point getXy()
  {
    return xy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXy(Point newXy, NotificationChain msgs)
  {
    Point oldXy = xy;
    xy = newXy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReseauPackage.DECLARATION_POINT__XY, oldXy, newXy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setXy(Point newXy)
  {
    if (newXy != xy)
    {
      NotificationChain msgs = null;
      if (xy != null)
        msgs = ((InternalEObject)xy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReseauPackage.DECLARATION_POINT__XY, null, msgs);
      if (newXy != null)
        msgs = ((InternalEObject)newXy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReseauPackage.DECLARATION_POINT__XY, null, msgs);
      msgs = basicSetXy(newXy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReseauPackage.DECLARATION_POINT__XY, newXy, newXy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ReseauPackage.DECLARATION_POINT__XY:
        return basicSetXy(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ReseauPackage.DECLARATION_POINT__NAME:
        return getName();
      case ReseauPackage.DECLARATION_POINT__XY:
        return getXy();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ReseauPackage.DECLARATION_POINT__NAME:
        setName((String)newValue);
        return;
      case ReseauPackage.DECLARATION_POINT__XY:
        setXy((Point)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ReseauPackage.DECLARATION_POINT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ReseauPackage.DECLARATION_POINT__XY:
        setXy((Point)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ReseauPackage.DECLARATION_POINT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ReseauPackage.DECLARATION_POINT__XY:
        return xy != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DeclarationPointImpl
