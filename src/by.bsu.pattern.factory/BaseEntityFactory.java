package by.bsu.pattern.factory;

import by.bsu.pattern.entity.Entity;

public class BaseEntityFactory {
  public Entity createEntity() {
    return new Entity();
  }
}
