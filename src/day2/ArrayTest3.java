package day2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest3 {
  public static void main(String[] args) {
    int[] arr = new int[10];

    Scanner input = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      System.out.println("请输入 " + i + " 数");
      arr[i] = input.nextInt();
    }

    Arrays.sort(arr);
    System.out.println(arr[0]);
    System.out.println(arr[arr.length-1]);
  }
}
