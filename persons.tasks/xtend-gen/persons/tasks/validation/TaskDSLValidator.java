/**
 * generated by Xtext 2.19.0
 */
package persons.tasks.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import persons.tasks.taskDSL.Duration;
import persons.tasks.taskDSL.Person;
import persons.tasks.taskDSL.Planning;
import persons.tasks.taskDSL.Task;
import persons.tasks.taskDSL.TimeUnit;
import persons.tasks.validation.AbstractTaskDSLValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class TaskDSLValidator extends AbstractTaskDSLValidator {
  @Check
  public Object checkTimeUnit(final Task task) {
    Object _xifexpression = null;
    Duration _duration = task.getDuration();
    boolean _tripleNotEquals = (_duration != null);
    if (_tripleNotEquals) {
      Object _switchResult = null;
      TimeUnit _unit = task.getDuration().getUnit();
      if (_unit != null) {
        switch (_unit) {
          case MINUTE:
            int _dl = task.getDuration().getDl();
            boolean _greaterThan = (_dl > 1000);
            if (_greaterThan) {
              this.warning("Rewrite to other unit", null);
            }
            break;
          case HOUR:
            _switchResult = null;
            break;
          case DAY:
            int _dl_1 = task.getDuration().getDl();
            boolean _greaterThan_1 = (_dl_1 > 150);
            if (_greaterThan_1) {
              this.info("Maybe rewrite to weeks", null);
            }
            break;
          case WEEK:
            int _dl_2 = task.getDuration().getDl();
            boolean _greaterThan_2 = (_dl_2 > 52);
            if (_greaterThan_2) {
              this.error("Deadline longer than 1 year not allowed", null);
            }
            break;
          default:
            break;
        }
      }
      _xifexpression = _switchResult;
    }
    return _xifexpression;
  }
  
  @Check
  public void checkDoublePersons(final Planning planning) {
    EList<Person> plist = planning.getPersons();
    for (int i = 0; (i < plist.size()); i++) {
      for (int j = (i + 1); (j < plist.size()); j++) {
        boolean _equals = plist.get(i).getName().equals(plist.get(j).getName());
        if (_equals) {
          this.error("Double name", null);
        }
      }
    }
  }
}
