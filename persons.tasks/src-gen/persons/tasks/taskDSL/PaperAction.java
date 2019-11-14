/**
 * generated by Xtext 2.19.0
 */
package persons.tasks.taskDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paper Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link persons.tasks.taskDSL.PaperAction#getReport <em>Report</em>}</li>
 * </ul>
 *
 * @see persons.tasks.taskDSL.TaskDSLPackage#getPaperAction()
 * @model
 * @generated
 */
public interface PaperAction extends Action
{
  /**
   * Returns the value of the '<em><b>Report</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Report</em>' attribute.
   * @see #setReport(String)
   * @see persons.tasks.taskDSL.TaskDSLPackage#getPaperAction_Report()
   * @model
   * @generated
   */
  String getReport();

  /**
   * Sets the value of the '{@link persons.tasks.taskDSL.PaperAction#getReport <em>Report</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Report</em>' attribute.
   * @see #getReport()
   * @generated
   */
  void setReport(String value);

} // PaperAction
