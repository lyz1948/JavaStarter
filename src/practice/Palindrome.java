package practice;

public class Palindrome {
  public static void main(String[] args) {
    int min = 1000;
    int max = 9999;

    int ones;
    int tens;
    int hundreds;
    int thousands;

    for (int i = min; i < max; i++) {
      ones = i % 10;
      tens = (i/10)%10;
      hundreds = (i/100)%10;
      thousands = (i/1000);

      if (ones == thousands && tens == hundreds) {
        System.out.println(i);
      }
    }
  }
}
