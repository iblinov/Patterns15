package by.bsu.adapter;

import java.io.*;

public class AdapterMain {
  public static void main(String[] args) throws IOException {
     Validator validator = new ValidatorImpl(new ValidateServiceImpl());

  }
}
