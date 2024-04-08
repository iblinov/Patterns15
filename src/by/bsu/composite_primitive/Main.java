package by.bsu.composite_primitive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    int[][] matrix = {
            {1, 4, 2, 3},
            {5, 9, 0, 1},
            {7, 1, 1, 0}
    };
    System.out.println(Arrays.toString(matrix[0]));
    System.out.println(Arrays.toString(matrix[1]));
    System.out.println(Arrays.toString(matrix[2]));

    List<String> lst0 = new ArrayList<>();
    lst0.add("Process");
    lst0.add("finished");
    lst0.add("with");
    lst0.add("exit");
    lst0.add("code.");

    List<String> lst1 = new ArrayList<>();
    lst1.add("Tutorials");
    lst1.add("and");
    lst1.add("code");
    lst1.add("examples.");

    List<String> lst2 = new ArrayList<>();
    lst2.add("Cover");
    lst2.add("tutorials");
    lst2.add("about");
    lst2.add("Java");
    lst2.add("applets.");

    List<List<String>> lists = new ArrayList<>();
    lists.add(lst0);
    lists.add(lst1);
    lists.add(lst2);
    System.out.println(lists);

    ParagraphComposite paragraph = new ParagraphComposite();
    ParagraphComposite sentence1 = new ParagraphComposite();
    ParagraphComposite sentence2 = new ParagraphComposite();
    ParagraphComposite sentence3 = new ParagraphComposite();
    sentence1.add(new Lexem("Process"));
    sentence1.add(new Lexem("finished"));
    sentence1.add(new Lexem("with"));
    sentence1.add(new Lexem("exit"));
    sentence1.add(new Lexem("code."));
    sentence2.add(new Lexem("Tutorials"));
    sentence2.add(new Lexem("and"));
    sentence2.add(new Lexem("code"));
    sentence2.add(new Lexem(""));
    sentence2.add(new Lexem("examples."));
    sentence3.add(new Lexem("Cover"));
    sentence3.add(new Lexem("tutorials"));
    sentence3.add(new Lexem("about"));
    sentence3.add(new Lexem("Java"));
    sentence3.add(new Lexem("applets."));
    paragraph.add(sentence1);
    paragraph.add(new Lexem("- los."));///!!!!
    paragraph.add(sentence2);
    paragraph.add(sentence3);
    System.out.println(paragraph.findNumberOfSymbols());
    System.out.println(paragraph.toString());
    System.out.println("___________________________");
    ///
    ParagraphComposite text = new ParagraphComposite();
    text.add(paragraph);
    //////
    ParagraphComposite paragraph2 = new ParagraphComposite();
    ParagraphComposite sentence11 = new ParagraphComposite();
    ParagraphComposite sentence22 = new ParagraphComposite();
    ParagraphComposite sentence33 = new ParagraphComposite();
    sentence11.add(new Lexem("Process1"));
    sentence11.add(new Lexem("finished1"));
    sentence11.add(new Lexem("with1"));
    sentence11.add(new Lexem("exit1"));
    sentence11.add(new Lexem("code.1"));
    sentence22.add(new Lexem("Tutorials1"));
    sentence22.add(new Lexem("and1"));
    sentence22.add(new Lexem("code1"));
    sentence22.add(new Lexem(""));
    sentence22.add(new Lexem("examples.1"));
    sentence33.add(new Lexem("Cover1"));
    sentence33.add(new Lexem("tutorials1"));
    sentence33.add(new Lexem("about1"));
    sentence33.add(new Lexem("Java1"));
    sentence33.add(new Lexem("applets.1"));
    paragraph2.add(sentence11);
    paragraph2.add(sentence22);
    paragraph2.add(sentence33);
    /////
    text.add(paragraph2);

    System.out.println(text.findNumberOfSymbols());
    System.out.println(text);
  }
}
