package by.bsu.factory;

import by.bsu.factory.entity.Entity;

public class GenericEntityFactory extends GenericFactory<Entity> {
  @Override
  public Entity create() {
    return new Entity();
  }
}
