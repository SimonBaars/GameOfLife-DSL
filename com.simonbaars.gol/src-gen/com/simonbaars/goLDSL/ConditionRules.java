/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.goLDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.simonbaars.goLDSL.ConditionRules#getRule1 <em>Rule1</em>}</li>
 *   <li>{@link com.simonbaars.goLDSL.ConditionRules#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.simonbaars.goLDSL.ConditionRules#getRule2 <em>Rule2</em>}</li>
 * </ul>
 *
 * @see com.simonbaars.goLDSL.GoLDSLPackage#getConditionRules()
 * @model
 * @generated
 */
public interface ConditionRules extends Condition
{
  /**
   * Returns the value of the '<em><b>Rule1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule1</em>' containment reference.
   * @see #setRule1(ConditionRule)
   * @see com.simonbaars.goLDSL.GoLDSLPackage#getConditionRules_Rule1()
   * @model containment="true"
   * @generated
   */
  ConditionRule getRule1();

  /**
   * Sets the value of the '{@link com.simonbaars.goLDSL.ConditionRules#getRule1 <em>Rule1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule1</em>' containment reference.
   * @see #getRule1()
   * @generated
   */
  void setRule1(ConditionRule value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link com.simonbaars.goLDSL.BoolOperator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see com.simonbaars.goLDSL.BoolOperator
   * @see #setOperator(BoolOperator)
   * @see com.simonbaars.goLDSL.GoLDSLPackage#getConditionRules_Operator()
   * @model
   * @generated
   */
  BoolOperator getOperator();

  /**
   * Sets the value of the '{@link com.simonbaars.goLDSL.ConditionRules#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see com.simonbaars.goLDSL.BoolOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(BoolOperator value);

  /**
   * Returns the value of the '<em><b>Rule2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule2</em>' containment reference.
   * @see #setRule2(ConditionRules)
   * @see com.simonbaars.goLDSL.GoLDSLPackage#getConditionRules_Rule2()
   * @model containment="true"
   * @generated
   */
  ConditionRules getRule2();

  /**
   * Sets the value of the '{@link com.simonbaars.goLDSL.ConditionRules#getRule2 <em>Rule2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule2</em>' containment reference.
   * @see #getRule2()
   * @generated
   */
  void setRule2(ConditionRules value);

} // ConditionRules
