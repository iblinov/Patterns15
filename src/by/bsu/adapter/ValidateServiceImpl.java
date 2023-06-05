package by.bsu.adapter;

public class ValidateServiceImpl implements ValidateService {
  private static final String LOGIN_REGEX = "\\w{3,8}";
  @Override
  public boolean validate(String str) {
    boolean match = false;
    if (str != null) {
      match = str.matches(LOGIN_REGEX);
    }
    return match;
  }

  @Override
  public boolean validate(String str, String regEx) {
    boolean match = false;
    if (str != null) {
      match = str.matches(regEx);
    }
    return match;
  }

}
