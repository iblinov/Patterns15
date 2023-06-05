package by.bsu.composite;

public interface ProjectComponent {
    void add(ProjectComponent component);
    void remove(ProjectComponent component);
    long defineTimeRequired();
}
