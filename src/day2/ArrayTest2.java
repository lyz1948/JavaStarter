package day2;

import java.util.Arrays;

public class ArrayTest2 {

  public static void main(String[] args) {
    int[] arr = { 32, 87, 19, -72, 52, 17 };

    System.out.println(arr.length);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println("\n-----排序之前-------\n");

    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println("\n----降序排序------\n");
    for (int i = arr.length -1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
  }
}
