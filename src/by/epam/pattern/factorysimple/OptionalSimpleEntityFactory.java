package by.epam.pattern.factorysimple;

import by.bsu.factory.entity.Entity;
import by.bsu.factory.entity.Item;
import by.bsu.factory.entity.Thing;

import java.util.Optional;

public class OptionalSimpleEntityFactory {
  public static Optional<Entity> createEntity(String mode) {
    Optional<Entity> entity;
    switch (mode) {
      case "entity":
        entity = Optional.of(new Entity());
        break;
      case "item" :
        entity = Optional.of(new Item());
        break;
      case "thing" :
        entity = Optional.of(new Thing());
        break;
      default:
        entity = Optional.empty();
    }
    return entity;
  }
}
