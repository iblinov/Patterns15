package by.bsu.repository;

import by.epam.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Repository {
  private List<Student> students = new ArrayList<>();

  public Repository(List<Student> students) {
    this.students = students;
  }

  public boolean add(Student student) {
    return students.add(student);
  }

  public boolean remove(Object o) {
    return students.remove(o);
  }

  public void sort(Comparator<? super Student> c) {
    students.sort(c);
  }

  public List<Student> query(Specification specification) {
    List<Student> result = new ArrayList<>();
    for (Student st : students) {
      if (specification.specify(st)) {
        result.add(st);
      }
    }
    return result;
  }
  public List<Student> queryStream(Specification specification) {
    List<Student> result = students.stream()
            .filter(st -> specification.specify(st))
            .toList();
            return result;
  }
  public List<Student> queryStreamPredicate(SpecificationPredicate specification) {
         return students.stream()
                 .filter(specification)
                 .toList();
  }
}