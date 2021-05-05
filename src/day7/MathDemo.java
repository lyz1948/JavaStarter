package day7;

import java.util.Random;

public class MathDemo {
  public static void main(String[] args) {

    System.out.println(Math.abs(-20));
    System.out.println(Math.PI);
    System.out.println(Math.random());
    System.out.println(Math.E);
    System.out.println(Math.cos(12));
    System.out.println(Math.ceil(3.16));
    System.out.println(Math.floor(-3.16));
    System.out.println(Math.sqrt(100));
    System.out.println(Math.max(5, 8));

    Random r = new Random();

    for (int i = 0; i < 100; i++) {
      // System.out.println(r.nextInt(100)); // 随机整数
      System.out.println(r.nextDouble()); // 随机小数
    }
  }
}
