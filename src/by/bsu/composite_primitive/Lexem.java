package by.bsu.composite_primitive;

import java.util.StringJoiner;

public class Lexem implements ParagraphComponent {
  private String content;

  public Lexem(String content) {
    this.content = content;
  }

  @Override
  public int findNumberOfSymbols() {
    return content.length();
  }

  @Override
  public boolean add(ParagraphComponent component) {
    return false;
  }

  @Override
  public boolean remove(ParagraphComponent component) {
    return false;
  }

  @Override
  public ParagraphComponent getSubComponent(int index) {
    throw new UnsupportedOperationException("");
  }

  @Override
  public String toString() {
    return content;
  }
}
