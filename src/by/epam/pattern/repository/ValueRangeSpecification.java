package by.epam.pattern.repository;

public class ValueRangeSpecification implements Specification<Integer> {
  private int min;
  private int max;

  public ValueRangeSpecification(int min, int max) {
    this.min = min;
    this.max = max;
  }

  @Override
  public boolean specify(Integer value) {
    return min < value && max > value;
  }
}
