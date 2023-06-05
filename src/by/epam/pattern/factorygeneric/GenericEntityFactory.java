package by.epam.pattern.factorygeneric;

import by.bsu.factory.entity.Entity;

public class GenericEntityFactory implements GenericFactory<Entity> {
  @Override
  public Entity create() {
    return new Entity();
  }
}
