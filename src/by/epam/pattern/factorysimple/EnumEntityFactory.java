package by.epam.pattern.factorysimple;

import by.bsu.factory.entity.Entity;
import java.util.stream.Stream;

public class EnumEntityFactory {
  public static Entity create(String mode) {
   boolean flag = Stream.of(EntityType.values())
           .anyMatch(o -> o.name().equalsIgnoreCase(mode));
   if(flag) {
     return EntityType.valueOf(mode).newEntity();
   }
   throw new IllegalArgumentException();
  }
  public static Entity createEntity(final String mode) {
    return Stream.of(EntityType.values())
            .filter(o -> o.name().equalsIgnoreCase(mode))
            .findFirst()
            .orElseThrow(IllegalArgumentException::new)
            .newEntity();

  }
}
