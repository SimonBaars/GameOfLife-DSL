/**
 * generated by Xtext 2.19.0
 */
package persons.tasks;

import persons.tasks.TaskDSLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class TaskDSLStandaloneSetup extends TaskDSLStandaloneSetupGenerated {
  public static void doSetup() {
    new TaskDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
