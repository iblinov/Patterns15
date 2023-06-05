package by.epam.pattern.factorygeneric;

import by.bsu.factory.entity.Entity;
@FunctionalInterface
public interface GenericFactory<T extends Entity> {
  T create();
}
