package by.bsu.pattern.factory;

import by.bsu.pattern.entity.Entity;
import by.bsu.pattern.entity.Item;
import by.bsu.pattern.entity.Thing;

public class PrimitiveEntityFactory {
  public static Entity createEntity(String mode) {
    switch (mode.toLowerCase()) {
      case "entity" : return new Entity();
      case "item" : return new Item();
      case "thing" : return new Thing();
      default: throw new IllegalArgumentException(mode);
    }
  }
}
