public class Task implements Priority{
    private String name;
    private int priority;
    private boolean isComplete;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
        isComplete = false;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    public int getPriority() {
        return priority;
    }
    public boolean isComplete() {
        return isComplete;
    }
    public void doTask() {
        System.out.println("Doing task... \nWorking...");
        isComplete = true;
        priority = -1;
    }
    public String toString() {
        return "Task: " + name + "\nPriority: " + priority;
    }
}
