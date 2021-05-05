package day1;

import java.util.Scanner;

public class ScanInput {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num;
    float f;
    double d;
    boolean flag;
    String s;

    System.out.println("请输入一个number类型的值：");
    num = input.nextInt();

    System.out.println("请输入一个浮点类型：");
    f = input.nextFloat();

    System.out.println("请输入一个double类型");
    d = input.nextDouble();

    System.out.println("请输入一个布尔类型");
    flag = input.nextBoolean();

    System.out.println("请输入一个字符串");
    s = input.next();

    System.out.println(num);
    System.out.println(f);
    System.out.println(d);
    System.out.println(flag);
    System.out.println(s);
  }
}
