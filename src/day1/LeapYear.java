package day1;

public class LeapYear {
  public static void main(String[] args) {
    int year = 1900;

    while (year < 2050) {
      if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {

        System.out.println(year);
      }
      year++;
    }
  }
}
