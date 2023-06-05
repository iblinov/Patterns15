package by.bsu.factory;

import by.bsu.factory.entity.Thing;

public class ThingFactory extends BaseEntityFactory {
  @Override
  public Thing createEntity() {
    return new Thing();
  }
}
