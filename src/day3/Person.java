package day3;

public class Person {
  String name;
  int age;

  static {
    System.out.println("代码块，只初始化一次");
  }

  Person() {
    System.out.println("一个人诞生了...");
  }

  // 函数重载
  Person(String name, int age) {
    this(); // 调用上面的Person函数
    this.name = name;
    this.age = age;
  }

  static void doWork() {
    System.out.println("开始工作了");
  }

  public static void main(String[] args) {
    Person p1 = new Person("吴继光", 30);
    Person p2 = new Person("周晓东", 20);
    Person.doWork(); // 静态方法推荐使用类名来调用
    p1.doWork();
    p2.doWork();
  }
}
