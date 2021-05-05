package day1;

import java.util.Scanner;

public class TaxiPrice {
  public static void main(String[] args) {
    double totalPrice;
    int startPrice = 6;
    int time;
    int distance;

    Scanner input = new Scanner(System.in);

    System.out.print("请输入打车时间：（0~23）：");
    time = input.nextInt();

    System.out.print("请输入打车距离：");
    distance = input.nextInt();

    if (time < 6 || time > 21) {
      startPrice = 7;
    }

    if (distance > 2) {
      totalPrice = startPrice + (distance - 2) * 1.5;
    } else {
      totalPrice = startPrice;
    }

    totalPrice++;

    System.out.println("总费用：" + totalPrice + " 元");
  }
}
