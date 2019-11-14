/**
 * generated by Xtext 2.19.0
 */
package persons.tasks.taskDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Bin Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link persons.tasks.taskDSL.ExpressionBinOp#getLeft <em>Left</em>}</li>
 *   <li>{@link persons.tasks.taskDSL.ExpressionBinOp#getBop <em>Bop</em>}</li>
 *   <li>{@link persons.tasks.taskDSL.ExpressionBinOp#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see persons.tasks.taskDSL.TaskDSLPackage#getExpressionBinOp()
 * @model
 * @generated
 */
public interface ExpressionBinOp extends BooleanExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(BooleanExpression)
   * @see persons.tasks.taskDSL.TaskDSLPackage#getExpressionBinOp_Left()
   * @model containment="true"
   * @generated
   */
  BooleanExpression getLeft();

  /**
   * Sets the value of the '{@link persons.tasks.taskDSL.ExpressionBinOp#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(BooleanExpression value);

  /**
   * Returns the value of the '<em><b>Bop</b></em>' attribute.
   * The literals are from the enumeration {@link persons.tasks.taskDSL.BinaryBooleanOperator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bop</em>' attribute.
   * @see persons.tasks.taskDSL.BinaryBooleanOperator
   * @see #setBop(BinaryBooleanOperator)
   * @see persons.tasks.taskDSL.TaskDSLPackage#getExpressionBinOp_Bop()
   * @model
   * @generated
   */
  BinaryBooleanOperator getBop();

  /**
   * Sets the value of the '{@link persons.tasks.taskDSL.ExpressionBinOp#getBop <em>Bop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bop</em>' attribute.
   * @see persons.tasks.taskDSL.BinaryBooleanOperator
   * @see #getBop()
   * @generated
   */
  void setBop(BinaryBooleanOperator value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(BooleanExpression)
   * @see persons.tasks.taskDSL.TaskDSLPackage#getExpressionBinOp_Right()
   * @model containment="true"
   * @generated
   */
  BooleanExpression getRight();

  /**
   * Sets the value of the '{@link persons.tasks.taskDSL.ExpressionBinOp#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(BooleanExpression value);

} // ExpressionBinOp
