package day14;

public class Car {
  private String brand;
  private Colors color = Colors.BLACK;

  Car() {
    System.out.println("又卖出了一辆车");
  }

  Car(String brand, Colors color) {
    this.brand = brand;
    this.color = color;
  }

  public String toString() {
    return "品牌：" + this.brand + ", 颜色：" + this.color;
  }
}
