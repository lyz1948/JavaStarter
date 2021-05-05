package day4;

public class Coffe {

  String owner; // 咖啡拥有者
  String dosing; // 调料

  Coffe() {
    System.out.println("又卖出一杯咖啡");
  }

  Coffe(String owner, String dosing) {
    this();
    this.owner = owner;
    this.dosing = dosing;
  }

  public static void changeDosing(Coffe coffe) {
    System.out.println(coffe.hashCode());
    // coffe.dosing = "牛奶";
    coffe = new Coffe("无双", "红糖");
    System.out.println(coffe.hashCode());
  }

  public void showInfo() {
    System.out.println(this.owner + "的咖啡" + "调料加" + this.dosing);
  }

  public static void main(String[] args) {
    Coffe coffe = new Coffe("刘梅", "糖");
    System.out.println("------------更换之前---------");
    coffe.showInfo();

    System.out.println(coffe.hashCode());
    Coffe.changeDosing(coffe);
    System.out.println("------------更换之后---------");
    coffe.showInfo();
  }
}
