package by.bsu.adapter;
// https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
public interface Validator {
  boolean validateLogin(String login);
  boolean validateEmail(String email);
}
