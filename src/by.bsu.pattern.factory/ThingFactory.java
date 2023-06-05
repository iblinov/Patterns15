package by.bsu.pattern.factory;

import by.bsu.pattern.entity.Entity;
import by.bsu.pattern.entity.Thing;

public class ThingFactory extends BaseEntityFactory {
  @Override
  public Thing createEntity() {
    return new Thing();
  }
}
