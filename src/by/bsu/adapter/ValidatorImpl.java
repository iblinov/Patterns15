package by.bsu.adapter;

public class ValidatorImpl implements Validator {
  private ValidateService service;

  public ValidatorImpl(ValidateService service) {
    this.service = service;
  }

  @Override
  public boolean validateLogin(String login) {
    return service.validate(login);
  }
  @Override
  public boolean validateEmail(String email) {
    String emailRegEx = "\\w@\\[a-z]{2,10}\\.[a-z]{2,4}";
    return service.validate(email, emailRegEx);
  }
}
