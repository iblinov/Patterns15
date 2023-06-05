package by.epam.pattern.factoryinheritance;

import by.bsu.factory.entity.Entity;

public class EntityFactory {
  public Entity create(){
    return new Entity();
  }
}
