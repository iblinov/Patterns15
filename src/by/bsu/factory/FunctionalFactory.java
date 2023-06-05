package by.bsu.factory;

import by.bsu.factory.entity.Entity;

@FunctionalInterface
public interface FunctionalFactory<T extends Entity>  {
  T get(String ... data);
}
