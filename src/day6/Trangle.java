package day6;

public class Trangle extends Shape {

  int a, b, c;

  // 海伦公式
  // p = (a+b+c)/2 p*(p-a)*(p-b)*(p-c)
  double p = 0.0;

  Trangle(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.p = (a+b+c)/2.0; // 注意：分母必须是double类型，否则会丢失精度
  }

  @Override
  public double getArea() {
    return p*(p-a)*(p-b)*(p-c);
  }

  @Override
  public double getCircle() {
    return a + b + c;
  }
}
