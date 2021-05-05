package day7;

import java.text.DecimalFormat;

public class DecimalDemo {

  public static final double PI = 3.14;

  public static double getArea(int r) {
    return PI * r * r;
  }

  public static void main(String[] args) {

    int r = 12;
    System.out.println(getArea(r));

    DecimalFormat df = new DecimalFormat("#0.00");

    // 返回字符串类型
    String res = df.format(DecimalDemo.getArea(r));
    System.out.println(res);
  }
}
