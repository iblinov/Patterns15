package by.bsu.pattern.factory;

import by.bsu.pattern.entity.Entity;

@FunctionalInterface
public interface FunctionalFactory<T extends Entity>  {
  T get(String ... data);
}
