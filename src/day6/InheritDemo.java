package day6;

public class InheritDemo {
  public static void main(String[] args) {

    int a = 3;
    int b = 4;
    int c = 5;
    int r = 5;

    Shape trangle = new Trangle(a, b, c);
    Shape circle = new Circle(r);

    double area = trangle.getArea();
    double circleRes = trangle.getCircle();

    System.out.println("面积：" + area);
    System.out.println("周长：" + circleRes);

    double circleArea = circle.getArea();
    double circleTotal = circle.getCircle();

    System.out.println("面积：" + circleArea);
    System.out.println("周长：" + circleTotal);
  }
}
