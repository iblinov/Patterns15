package by.bsu.adapter2;

import java.io.*;
import java.util.Scanner;

public class ReadFileMain {
  public static void main(String[] args) throws IOException {
    //1
    BufferedReader reader = new BufferedReader(new FileReader("data/data.txt"));
    System.out.println(reader.readLine());

    BufferedReader reader2 = new BufferedReader(new StringReader("java2"));
    System.out.println(reader2.readLine());
    //2
    PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(new File("data\\data.txt"))));
    printWriter.println("java8");
    printWriter.flush();
    printWriter = new PrintWriter(System.out);
    printWriter.println("java19");
    printWriter.flush();
  }
}
