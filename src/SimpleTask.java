public class SimpleTask extends Task {


    public SimpleTask(String title, String description, int priority, String status) {
        super(title, description, priority, status);
    }

    public SimpleTask() {

    }

    @Override
    public String toString() {
        return "SimpleTask" + super.toString();
    }
}
