package by.bsu.factory;
import by.bsu.factory.entity.Item;

public class ItemFactory extends BaseEntityFactory {

  public Item createEntity() {
    return new Item();
  }
}
