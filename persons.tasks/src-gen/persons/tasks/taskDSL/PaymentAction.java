/**
 * generated by Xtext 2.19.0
 */
package persons.tasks.taskDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link persons.tasks.taskDSL.PaymentAction#getCondition <em>Condition</em>}</li>
 *   <li>{@link persons.tasks.taskDSL.PaymentAction#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see persons.tasks.taskDSL.TaskDSLPackage#getPaymentAction()
 * @model
 * @generated
 */
public interface PaymentAction extends Action
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(BooleanExpression)
   * @see persons.tasks.taskDSL.TaskDSLPackage#getPaymentAction_Condition()
   * @model containment="true"
   * @generated
   */
  BooleanExpression getCondition();

  /**
   * Sets the value of the '{@link persons.tasks.taskDSL.PaymentAction#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(BooleanExpression value);

  /**
   * Returns the value of the '<em><b>Amount</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Amount</em>' containment reference.
   * @see #setAmount(IntExpression)
   * @see persons.tasks.taskDSL.TaskDSLPackage#getPaymentAction_Amount()
   * @model containment="true"
   * @generated
   */
  IntExpression getAmount();

  /**
   * Sets the value of the '{@link persons.tasks.taskDSL.PaymentAction#getAmount <em>Amount</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount</em>' containment reference.
   * @see #getAmount()
   * @generated
   */
  void setAmount(IntExpression value);

} // PaymentAction
