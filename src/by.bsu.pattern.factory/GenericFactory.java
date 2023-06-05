package by.bsu.pattern.factory;

import by.bsu.pattern.entity.Entity;

public abstract class GenericFactory<T extends Entity> {
  public abstract T create();
}
