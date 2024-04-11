package by.epam.pattern.chaintext;

import by.bsu.composite2.TextComposite;

public abstract class AbstractTextParser {
  protected AbstractTextParser successor;
  public abstract void parse(String text, TextComposite composite);
}
