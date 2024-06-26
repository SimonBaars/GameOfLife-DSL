/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.goLDSL.impl;

import com.simonbaars.goLDSL.BoolOperator;
import com.simonbaars.goLDSL.ConditionRule;
import com.simonbaars.goLDSL.ConditionRules;
import com.simonbaars.goLDSL.GoLDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Rules</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.simonbaars.goLDSL.impl.ConditionRulesImpl#getRule1 <em>Rule1</em>}</li>
 *   <li>{@link com.simonbaars.goLDSL.impl.ConditionRulesImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.simonbaars.goLDSL.impl.ConditionRulesImpl#getRule2 <em>Rule2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionRulesImpl extends ConditionImpl implements ConditionRules
{
  /**
   * The cached value of the '{@link #getRule1() <em>Rule1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule1()
   * @generated
   * @ordered
   */
  protected ConditionRule rule1;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final BoolOperator OPERATOR_EDEFAULT = BoolOperator.AND;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected BoolOperator operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getRule2() <em>Rule2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule2()
   * @generated
   * @ordered
   */
  protected ConditionRules rule2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionRulesImpl()
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
    return GoLDSLPackage.Literals.CONDITION_RULES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConditionRule getRule1()
  {
    return rule1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRule1(ConditionRule newRule1, NotificationChain msgs)
  {
    ConditionRule oldRule1 = rule1;
    rule1 = newRule1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoLDSLPackage.CONDITION_RULES__RULE1, oldRule1, newRule1);
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
  public void setRule1(ConditionRule newRule1)
  {
    if (newRule1 != rule1)
    {
      NotificationChain msgs = null;
      if (rule1 != null)
        msgs = ((InternalEObject)rule1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoLDSLPackage.CONDITION_RULES__RULE1, null, msgs);
      if (newRule1 != null)
        msgs = ((InternalEObject)newRule1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoLDSLPackage.CONDITION_RULES__RULE1, null, msgs);
      msgs = basicSetRule1(newRule1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoLDSLPackage.CONDITION_RULES__RULE1, newRule1, newRule1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoolOperator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOperator(BoolOperator newOperator)
  {
    BoolOperator oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoLDSLPackage.CONDITION_RULES__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConditionRules getRule2()
  {
    return rule2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRule2(ConditionRules newRule2, NotificationChain msgs)
  {
    ConditionRules oldRule2 = rule2;
    rule2 = newRule2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoLDSLPackage.CONDITION_RULES__RULE2, oldRule2, newRule2);
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
  public void setRule2(ConditionRules newRule2)
  {
    if (newRule2 != rule2)
    {
      NotificationChain msgs = null;
      if (rule2 != null)
        msgs = ((InternalEObject)rule2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoLDSLPackage.CONDITION_RULES__RULE2, null, msgs);
      if (newRule2 != null)
        msgs = ((InternalEObject)newRule2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoLDSLPackage.CONDITION_RULES__RULE2, null, msgs);
      msgs = basicSetRule2(newRule2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoLDSLPackage.CONDITION_RULES__RULE2, newRule2, newRule2));
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
      case GoLDSLPackage.CONDITION_RULES__RULE1:
        return basicSetRule1(null, msgs);
      case GoLDSLPackage.CONDITION_RULES__RULE2:
        return basicSetRule2(null, msgs);
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
      case GoLDSLPackage.CONDITION_RULES__RULE1:
        return getRule1();
      case GoLDSLPackage.CONDITION_RULES__OPERATOR:
        return getOperator();
      case GoLDSLPackage.CONDITION_RULES__RULE2:
        return getRule2();
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
      case GoLDSLPackage.CONDITION_RULES__RULE1:
        setRule1((ConditionRule)newValue);
        return;
      case GoLDSLPackage.CONDITION_RULES__OPERATOR:
        setOperator((BoolOperator)newValue);
        return;
      case GoLDSLPackage.CONDITION_RULES__RULE2:
        setRule2((ConditionRules)newValue);
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
      case GoLDSLPackage.CONDITION_RULES__RULE1:
        setRule1((ConditionRule)null);
        return;
      case GoLDSLPackage.CONDITION_RULES__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case GoLDSLPackage.CONDITION_RULES__RULE2:
        setRule2((ConditionRules)null);
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
      case GoLDSLPackage.CONDITION_RULES__RULE1:
        return rule1 != null;
      case GoLDSLPackage.CONDITION_RULES__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case GoLDSLPackage.CONDITION_RULES__RULE2:
        return rule2 != null;
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //ConditionRulesImpl
