package by.epam.pattern.factoryinheritance;

import by.bsu.factory.entity.Thing;

public class ThingFactory extends EntityFactory {
  @Override
  public Thing create() {
    return new Thing();
  }
}
