package day1;

public class Operation2 {
  public static void main(String[] args) {
    int a = 10;
    int b = 7;

    if (++a > 10 || ++b > 7) {
      System.out.println("a:" + a + "b:" + b);
    }

    int c = a & b;
    System.out.println(c);

    int d = a | b;
    System.out.println(d);

    int e = a^b;
    System.out.println(e);

    int f = ~a;
    System.out.println(f);

    int g = a>>2;
    System.out.println(g);

    int h = a<<2;
    System.out.println(h);
  }
}
