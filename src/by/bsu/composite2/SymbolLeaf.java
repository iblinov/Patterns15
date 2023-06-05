package by.bsu.composite2;

public class SymbolLeaf implements TextComponent {
  private char symbol;
  private TextType type;
  public SymbolLeaf(char symbol) {
    this.symbol = symbol;
  }

  public SymbolLeaf(char symbol, TextType type) {
    this.symbol = symbol;
    this.type = type;
  }

  @Override
  public String action() {
    return " " + symbol + " " + type;
  }

  @Override
  public int count() {
    return 1;
  }
}
