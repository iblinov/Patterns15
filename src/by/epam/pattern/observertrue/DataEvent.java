package by.epam.pattern.observertrue;

import java.util.EventObject;

public class DataEvent extends EventObject {
  /**
   * Constructs a prototypical Event.
   *
   * @param source The object on which the Event initially occurred.
   * @throws IllegalArgumentException if source is null.
   */
  public DataEvent(DataHolder source) {
    super(source);
  }

  @Override
  public DataHolder getSource() {
    return (DataHolder)super.getSource();
  }
}
