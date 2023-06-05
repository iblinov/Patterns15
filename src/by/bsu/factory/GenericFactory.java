package by.bsu.factory;

import by.bsu.factory.entity.Entity;

public abstract class GenericFactory<T extends Entity> {
  public abstract T create();
}
