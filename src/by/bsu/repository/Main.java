package by.bsu.repository;

import by.epam.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Repository repository = new Repository(new ArrayList<>());
    //1
    IdSpecification specification = new IdSpecification(777);
    List<Student> r1 = repository.query(specification);
    //2
    List<Student> r2 = repository.queryStream(specification);
    //3
    IdSpecificationPredicate specificationPredicate = new IdSpecificationPredicate(779);
    List<Student> r3 = repository.queryStreamPredicate(specificationPredicate);
    //4
    List<Student> r4 = repository.queryStreamPredicate(st -> st.getId() == 777);
  }
}
