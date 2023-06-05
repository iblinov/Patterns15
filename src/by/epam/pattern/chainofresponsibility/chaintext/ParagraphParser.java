package by.epam.pattern.chainofresponsibility.chaintext;

import by.bsu.composite2.TextComposite;

public class ParagraphParser extends AbstractTextParser{
  public ParagraphParser() {
    this.successor = new SentenceParser();
  }

  @Override
  public void parse(String paragraph, TextComposite composite) {

  }
}
