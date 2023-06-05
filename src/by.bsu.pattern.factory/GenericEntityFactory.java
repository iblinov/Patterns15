package by.bsu.pattern.factory;

import by.bsu.pattern.entity.Entity;

public class GenericEntityFactory extends GenericFactory<Entity> {
  @Override
  public Entity create() {
    return new Entity();
  }
}
