package by.bsu.repository;

import by.epam.Student;

public class IdSpecificationPredicate implements SpecificationPredicate{
  private int id;

  public IdSpecificationPredicate(int id) {
    this.id = id;
  }

  @Override
  public boolean test(Student student) {
    return student.getId() == id;
  }
}
