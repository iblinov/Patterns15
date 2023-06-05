package by.bsu.adapter;

public interface ValidateService {
  boolean validate(String dataStr);
  boolean validate(String dataStr, final String regEx);

}
