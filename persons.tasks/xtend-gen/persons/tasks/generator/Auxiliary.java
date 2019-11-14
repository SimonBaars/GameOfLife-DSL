package persons.tasks.generator;

import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import persons.tasks.taskDSL.Action;
import persons.tasks.taskDSL.Planning;
import persons.tasks.taskDSL.Task;

@SuppressWarnings("all")
public class Auxiliary {
  public static List<Action> getActions(final Planning root) {
    final Function1<Task, Action> _function = (Task t) -> {
      return t.getAction();
    };
    return ListExtensions.<Task, Action>map(root.getTasks(), _function);
  }
}
