package day1;

import java.util.Scanner;

public class Judge {
  public static void main(String[] args) {
    boolean isRain;

    System.out.println("是否下雨 true/false");
    Scanner input = new Scanner(System.in);
    isRain = input.nextBoolean();

    if (isRain) {
      System.out.println("在家呆着");
    } else {
      System.out.println("去爬山");
    }
  }
}
