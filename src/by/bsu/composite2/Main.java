package by.bsu.composite2;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    TextComposite paragraph = new TextComposite();
    paragraph.setType(TextType.PARAGRAPH);
    TextComposite sentence1 = new TextComposite();
    TextComposite sentence2 = new TextComposite();
    sentence1.setType(TextType.SENTENCE);
    sentence2.setType(TextType.SENTENCE);
    paragraph.add(sentence1);
    paragraph.add(sentence2);
    TextComposite word1 = new TextComposite();
    TextComposite word2 = new TextComposite();
    TextComposite word3 = new TextComposite();
    TextComposite word4 = new TextComposite();
    word1.setType(TextType.WORD);
    word2.setType(TextType.WORD);
    word3.setType(TextType.WORD);
    word4.setType(TextType.WORD);
    sentence1.add(word1);
    sentence1.add(word2);
    sentence2.add(word3);
    sentence2.add(word4);
    SymbolLeaf letter1 = new SymbolLeaf('a');
    SymbolLeaf letter2 = new SymbolLeaf('b');
    SymbolLeaf letter3 = new SymbolLeaf('c');
    SymbolLeaf letter4 = new SymbolLeaf('d');
    SymbolLeaf letter5 = new SymbolLeaf('e');
    SymbolLeaf letter6 = new SymbolLeaf('f');
    SymbolLeaf letter7 = new SymbolLeaf('g');
    SymbolLeaf letter8 = new SymbolLeaf('h');
    SymbolLeaf letter9 = new SymbolLeaf('h');
    word1.add(letter1);
    word1.add(letter2);
    word1.add(letter9);
    word2.add(letter3);
    word2.add(letter4);
    word3.add(letter5);
    word3.add(letter6);
    word4.add(letter7);
    word4.add(letter8);
    System.out.println(paragraph.action());
    System.out.println(paragraph.count());

  }
}
class A{
  int g;

  public A(int g) {
    this.g = g;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof A a)) return false;

    return g == a.g;
  }

  @Override
  public int hashCode() {
    return 42;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", A.class.getSimpleName() + "[", "]")
            .add("g=" + g)
            .toString();
  }
}
class B{}
class M{
  static void f(A a){
    System.out.println("A");
  }
  static void f(B b){
    System.out.println("B");
  }
  public static void main(String[ ] args){
    Map<A, Integer> map = new HashMap<>();
    map.put(new A(2), 3);
    map.put(new A(3), 5);
    map.put(new A(4), 7);
    System.out.println(map);
    System.out.println(map.containsKey(new A(5)));
    IntStream is = IntStream.empty();

  }}
