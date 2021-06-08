package day14;

import java.util.Scanner;

public class Test {

  private static Car car = new Car();
  private static Scanner input = new Scanner(System.in);

  public static void chooseColor() {

    int choose;
    int count = 0;
    Colors car_color;

    System.out.println("请选择颜色");
    Colors[] colors = Colors.values();


    for (Colors c: colors) {
      System.out.print((count++) + " " + c.name() + ";\t");
    }
    System.out.println("");
    System.out.print("请选择:");
    choose = input.nextInt();
    car_color = colors[choose];

    switch (car_color) {
      case RED:
        System.out.println("red");
        break;
      case GREEN:
        System.out.println("green");
        break;
      case YELLOW:
        System.out.println("yellow");
        break;
      case BLUE:
        System.out.println("blue");
        break;
      case WHITE:
        System.out.println("white");
        break;
      default:
        System.out.println("black");
        break;
    }
  }

  public static void main(String[] args) {
    Colors color = Colors.RED;

    System.out.println(color.ordinal()); // 常量编号
    System.out.println(color.name());
    System.out.println(color.toString());
    System.out.println(color.getName());
    System.out.println(Enum.valueOf(Colors.class, "GREEN"));

    Test.chooseColor();
  }
}

