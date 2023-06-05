package by.epam.pattern.factorysimple;

import by.bsu.factory.entity.Entity;
import by.bsu.factory.entity.Item;
import by.bsu.factory.entity.Thing;

public enum EntityType {
  ENTITY {
    public Entity newEntity() {
      return new Entity();
    }
  },
  ITEM {
    public Item newEntity() {
      return new Item();
    }
  },
  THING {
    public Thing newEntity() {
      return new Thing();
    }
  };
  public abstract Entity newEntity();
}
