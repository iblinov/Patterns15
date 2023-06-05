package by.bsu.composite;
import java.util.LinkedList;

public class CompositeProject implements ProjectComponent {// task
    private long taskId;
    private LinkedList<ProjectComponent> listComponent = new LinkedList<>();

    public CompositeProject(long taskId) {
        this.taskId = taskId;
    }
    @Override
    public void add(ProjectComponent component) {
        listComponent.add(component);
    }
    @Override
    public void remove(ProjectComponent component) {
        listComponent.remove(component);
    }
    @Override
    public long defineTimeRequired() {
        long fullTime = 0;
        for (ProjectComponent rojectComponent : listComponent) {
            fullTime += rojectComponent.defineTimeRequired();
        }
        System.out.println(taskId + ", timeRequired = " + fullTime);
        return fullTime;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }
}
