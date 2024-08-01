import java.util.ArrayList;

public class ComplexTask extends Task {
    private ArrayList <SimpleTask> subTasks = new ArrayList<SimpleTask>();
    private static int subTasksCounter = 0;

    public ComplexTask(String title, String description, int priority, String status) {
        super(title, description, priority, status);
    }

    public ComplexTask(SimpleTask subTasks) {
        this.subTasks.add(subTasks);
    }

    public ComplexTask() {

    }

    public static int getSubTasksCounter() {
        return subTasksCounter;
    }
    public void allSubTasksCompleted() {
        for(SimpleTask subTask : subTasks) {
            subTask.setStatus("Выполнено");
        }
    }

    public void addSubTask(SimpleTask subTask) {
        subTasks.add(subTask);
        subTasksCounter++;
    }


    @Override
    public String toString() {
        return "ComplexTask "  + super.toString() + subTasks.toString();
    }
}
