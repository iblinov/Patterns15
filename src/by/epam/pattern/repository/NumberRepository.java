package by.epam.pattern.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberRepository {
  private List<Integer> numbers = new ArrayList<>();

  public NumberRepository(List<Integer> numbers) {
    this.numbers = numbers;
  }
  public List<Integer> query(Specification specification){
    return numbers.stream()
            .filter(o -> specification.specify(o))
            .toList();
  }
//  public void sort(SortigService service){
//    service.sorting(numbers);
//  }
}
