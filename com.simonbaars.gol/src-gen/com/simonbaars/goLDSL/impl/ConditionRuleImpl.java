/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.goLDSL.impl;

import com.simonbaars.goLDSL.ConditionRule;
import com.simonbaars.goLDSL.GoLDSLPackage;
import com.simonbaars.goLDSL.Range;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.simonbaars.goLDSL.impl.ConditionRuleImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link com.simonbaars.goLDSL.impl.ConditionRuleImpl#getRange <em>Range</em>}</li>
 *   <li>{@link com.simonbaars.goLDSL.impl.ConditionRuleImpl#getAlive <em>Alive</em>}</li>
 *   <li>{@link com.simonbaars.goLDSL.impl.ConditionRuleImpl#getDead <em>Dead</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionRuleImpl extends MinimalEObjectImpl.Container implements ConditionRule
{
  /**
   * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected static final int NUMBER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected int number = NUMBER_EDEFAULT;

  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected Range range;

  /**
   * The default value of the '{@link #getAlive() <em>Alive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlive()
   * @generated
   * @ordered
   */
  protected static final String ALIVE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlive() <em>Alive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlive()
   * @generated
   * @ordered
   */
  protected String alive = ALIVE_EDEFAULT;

  /**
   * The default value of the '{@link #getDead() <em>Dead</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDead()
   * @generated
   * @ordered
   */
  protected static final String DEAD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDead() <em>Dead</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDead()
   * @generated
   * @ordered
   */
  protected String dead = DEAD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionRuleImpl()
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
    return GoLDSLPackage.Literals.CONDITION_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumber(int newNumber)
  {
    int oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoLDSLPackage.CONDITION_RULE__NUMBER, oldNumber, number));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Range getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange(Range newRange, NotificationChain msgs)
  {
    Range oldRange = range;
    range = newRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoLDSLPackage.CONDITION_RULE__RANGE, oldRange, newRange);
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
  public void setRange(Range newRange)
  {
    if (newRange != range)
    {
      NotificationChain msgs = null;
      if (range != null)
        msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoLDSLPackage.CONDITION_RULE__RANGE, null, msgs);
      if (newRange != null)
        msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoLDSLPackage.CONDITION_RULE__RANGE, null, msgs);
      msgs = basicSetRange(newRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoLDSLPackage.CONDITION_RULE__RANGE, newRange, newRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAlive()
  {
    return alive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAlive(String newAlive)
  {
    String oldAlive = alive;
    alive = newAlive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoLDSLPackage.CONDITION_RULE__ALIVE, oldAlive, alive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDead()
  {
    return dead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDead(String newDead)
  {
    String oldDead = dead;
    dead = newDead;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoLDSLPackage.CONDITION_RULE__DEAD, oldDead, dead));
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
      case GoLDSLPackage.CONDITION_RULE__RANGE:
        return basicSetRange(null, msgs);
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
      case GoLDSLPackage.CONDITION_RULE__NUMBER:
        return getNumber();
      case GoLDSLPackage.CONDITION_RULE__RANGE:
        return getRange();
      case GoLDSLPackage.CONDITION_RULE__ALIVE:
        return getAlive();
      case GoLDSLPackage.CONDITION_RULE__DEAD:
        return getDead();
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
      case GoLDSLPackage.CONDITION_RULE__NUMBER:
        setNumber((Integer)newValue);
        return;
      case GoLDSLPackage.CONDITION_RULE__RANGE:
        setRange((Range)newValue);
        return;
      case GoLDSLPackage.CONDITION_RULE__ALIVE:
        setAlive((String)newValue);
        return;
      case GoLDSLPackage.CONDITION_RULE__DEAD:
        setDead((String)newValue);
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
      case GoLDSLPackage.CONDITION_RULE__NUMBER:
        setNumber(NUMBER_EDEFAULT);
        return;
      case GoLDSLPackage.CONDITION_RULE__RANGE:
        setRange((Range)null);
        return;
      case GoLDSLPackage.CONDITION_RULE__ALIVE:
        setAlive(ALIVE_EDEFAULT);
        return;
      case GoLDSLPackage.CONDITION_RULE__DEAD:
        setDead(DEAD_EDEFAULT);
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
      case GoLDSLPackage.CONDITION_RULE__NUMBER:
        return number != NUMBER_EDEFAULT;
      case GoLDSLPackage.CONDITION_RULE__RANGE:
        return range != null;
      case GoLDSLPackage.CONDITION_RULE__ALIVE:
        return ALIVE_EDEFAULT == null ? alive != null : !ALIVE_EDEFAULT.equals(alive);
      case GoLDSLPackage.CONDITION_RULE__DEAD:
        return DEAD_EDEFAULT == null ? dead != null : !DEAD_EDEFAULT.equals(dead);
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
    result.append(" (number: ");
    result.append(number);
    result.append(", alive: ");
    result.append(alive);
    result.append(", dead: ");
    result.append(dead);
    result.append(')');
    return result.toString();
  }

} //ConditionRuleImpl
