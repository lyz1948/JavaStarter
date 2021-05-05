package day6;

class Person {

  String name;
  int age;

  Person() {

  }
  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public void showInfo() {
    System.out.println("name is " + this.name + ", and age is " + this.age);
  }
}

public class FinalDemo {
  // final int TOTAL = 100; // 定义的时候初始化
  final int TOTAL;
  final Person p;

  FinalDemo()  {
    this.TOTAL = 1000; // 构造方法中初始化
    this.p = new Person("韩寒", 30);
  }

  public static void main(String[] args) {
    FinalDemo f = new FinalDemo();
    // f.TOTAL = 2000; // 不可修改
    f.p.showInfo();
    f.p.name = "白起";
    f.p.age = 50;
    // f.p = new Person("卫青", 40);
  }
}
