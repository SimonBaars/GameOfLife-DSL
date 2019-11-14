/**
 * generated by Xtext 2.19.0
 */
package persons.tasks.taskDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link persons.tasks.taskDSL.ProjectUse#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @see persons.tasks.taskDSL.TaskDSLPackage#getProjectUse()
 * @model
 * @generated
 */
public interface ProjectUse extends EObject
{
  /**
   * Returns the value of the '<em><b>Project</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project</em>' reference.
   * @see #setProject(Project)
   * @see persons.tasks.taskDSL.TaskDSLPackage#getProjectUse_Project()
   * @model
   * @generated
   */
  Project getProject();

  /**
   * Sets the value of the '{@link persons.tasks.taskDSL.ProjectUse#getProject <em>Project</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project</em>' reference.
   * @see #getProject()
   * @generated
   */
  void setProject(Project value);

} // ProjectUse