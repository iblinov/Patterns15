package by.epam.pattern.repository;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
         NumberRepository repository = new NumberRepository(List.of(1, 3 ,5, 7, 9, 8, 6, 34 , 2, 4));
         Specification specification = new ValueRangeSpecification(2, 9);
         List<Integer> res = repository.query(specification);
    System.out.println(res);
  }
}
