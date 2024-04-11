package by.epam.pattern.chaintext;

import by.bsu.composite2.TextComposite;

import java.util.ArrayList;
import java.util.List;

public class TextParser extends AbstractTextParser {
  public TextParser() {
    this.successor = new ParagraphParser();
  }

  @Override
  public void parse(String text, TextComposite composite) {
    List<String> paragraphs = new ArrayList<>();

    for (int i = 0; i < paragraphs.size(); i++) {
      successor.parse(paragraphs.get(i), composite);
    }
  }
}
