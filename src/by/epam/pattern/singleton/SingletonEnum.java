package by.epam.pattern.singleton;

import by.epam.Student;

import java.util.ArrayList;
import java.util.List;

public enum SingletonEnum {
  INSTANCE;
  private List<Student> students = new ArrayList<>();
}
