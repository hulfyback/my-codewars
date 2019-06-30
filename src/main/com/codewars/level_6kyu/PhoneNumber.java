package main.com.codewars.level_6kyu;

public class PhoneNumber {
  private static String pattern = "[(]\\d{3}[)] \\d{3}-\\d{4}";

  public static boolean validPhoneNumber(String phoneNumber) {
    return phoneNumber.matches(pattern);
  }
}
