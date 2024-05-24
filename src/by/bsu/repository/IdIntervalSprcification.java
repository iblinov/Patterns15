package by.bsu.repository;

import by.epam.Student;

public class IdIntervalSprcification implements Specification{
  private int minId;
  private int maxId;

  public IdIntervalSprcification(int minId, int maxId) {
    this.minId = minId;
    this.maxId = maxId;
  }

  @Override
  public boolean specify(Student t) {
    return (minId < t.getId() && t.getId() < maxId);
  }
}
