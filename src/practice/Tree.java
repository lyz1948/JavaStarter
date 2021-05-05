package practice;

import java.util.Scanner;

public class Tree {
  public static void main(String[] args) {
    int height; // 数的高度

    Scanner input = new Scanner(System.in);

    System.out.print("请输入数的高度: ");
    height = input.nextInt();

    for (int i = 1; i <= height; i++) {
      for (int j = 1; j <= height - i; j++) {
        System.out.print(" ");
      }

      for (int k = 1; k <= (i * 2) - 1; k++) {
        System.out.print("*");
      }

      System.out.println("");
    }
  }
}
