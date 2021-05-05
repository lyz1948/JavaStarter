package day1;

import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    int num;
    boolean flag = true;

    Scanner input = new Scanner(System.in);
    System.out.print("请输入一个整数：");
    num = input.nextInt();

    for (int i = 2; i < Math.sqrt(num); i++) {
      if (num %2 == 0) {
        flag = false;
        break;
      }
    }
    if (flag) {
      System.out.println(num + "是素数");
    } else {
      System.out.println("不是素数");
    }
  }
}
