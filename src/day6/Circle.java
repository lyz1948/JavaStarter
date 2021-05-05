package day6;

public class Circle extends Shape {
  int r;
  final double PI = 3.14;

  Circle(int r) {
    this.r = r;
  }

  @Override
  public double getArea() {
    return PI * r * r;
  }

  @Override
  public double getCircle() {
    return PI * r * 2;
  }
}
