package day2;

public class func {

  public static int add(int a, int b) {
    return a + b;
  }

  public static void swap(int x, int y) {
    int temp;
    temp = x;
    x = y;
    y = temp;
  }

  public static double getArea(int r) {
    return 3.14 * r * r;
  }

  public static double getCircle(int r) {
    return 3.14 * 2 * r;
  }

  public static void main(String[] args) {

    int x = 10;
    int y = 20;
    int r = 10;

    System.out.println(add(x, y));
    System.out.println(getArea(r));
    System.out.println(getCircle(r));
  }
}
