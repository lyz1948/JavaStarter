package day1;

public class Operation3 {
  public static void main(String[] args) {
    int a = 10;
    int b = 7;

    int temp;

    System.out.println("x=" + a + "y=" + b);

    System.out.println("交互之后 ----");
    temp = a;
    a = b;
    b = temp;
    System.out.println("x=" + a + "y=" + b);

    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("x=" + a + "y=" + b);

    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    System.out.println("x=" + a + "y=" + b);
  }
}
