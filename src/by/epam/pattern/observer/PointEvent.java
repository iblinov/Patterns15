package by.epam.pattern.observer;

import java.util.EventObject;

public class PointEvent extends EventObject {
  /**
   * Constructs a prototypical Event.
   *
   * @param source The object on which the Event initially occurred.
   * @throws IllegalArgumentException if source is null.
   */
  public PointEvent(Point source) {
    super(source);
  }

  @Override
  public Point getSource() {
    return (Point) super.getSource();
  }
}
