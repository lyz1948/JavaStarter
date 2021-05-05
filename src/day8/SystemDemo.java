package day8;

import java.util.Scanner;

class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    System.out.println("一个对象即将被销毁");
  }
}

public class SystemDemo {
  public static void main(String[] args) {
    System.out.println("打印输出");

    Scanner input = new Scanner(System.in); // 标准输入
    System.err.println("This is a error");

    // System.exit(0); // 正常退出
    // System.getProperties().list(System.out); // 环境变量
    System.out.println(System.getProperty("os.name"));

    // long start = System.currentTimeMillis();
    // for (int i = 0; i < 10000; i++) {
    //   System.out.println(i);
    // }
    // long end = System.currentTimeMillis();

    // System.out.println("运行时间为：" + (end - start) + "ms");

    Person p = new Person("张生", 30);
    p = null;

    System.gc();
  }
}
