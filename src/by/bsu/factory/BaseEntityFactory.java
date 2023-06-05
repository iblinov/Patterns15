package by.bsu.factory;

import by.bsu.factory.entity.Entity;

public class BaseEntityFactory {
  public Entity createEntity() {
    return new Entity();
  }
}
