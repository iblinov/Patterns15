package by.epam.pattern.chaintext;

import by.bsu.composite2.TextComposite;

public class SentenceParser extends AbstractTextParser{
  public SentenceParser() {
    this.successor = new WordParser();
  }

  @Override
  public void parse(String sentence, TextComposite composite) {

  }
}
