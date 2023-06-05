package by.epam.pattern.factorysimple;

import by.bsu.factory.entity.Entity;
import by.bsu.factory.entity.Item;
import by.bsu.factory.entity.Thing;

public class SimpleEntityFactory {
  public static Entity createEntity(String mode) {
    Entity entity;
    switch (mode) {
      case "entity":
        entity = new Entity();
        break;
      case "item" :
        entity = new Item();
        break;
      case "thing" :
        entity = new Thing();
        break;
      default:
        throw new IllegalArgumentException();
    }
    return entity;
  }
}
