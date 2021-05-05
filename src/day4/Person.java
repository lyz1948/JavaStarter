package day4;

public class Person {

  String name;
  String gender;
  int age;

  Person() {
    this.name = "无名氏";
    this.gender = "男";
    this.age = 10;
    System.out.println("有诞生了一位宝宝");
  }

  Person(String name, String gender) {
    this();
    this.name = name;
    this.gender = gender;
  }

  Person(String name, String gender, int age) {
    this(name, gender);
    this.age = age;
  }

  public void showInfo() {
    System.out.println("我的名字叫 " + this.name + ", 性别：" + this.gender + "，今年 " + this.age + " 岁了");
  }

  public static void main(String[] args) {
    Person p = new Person();
    p.showInfo();
    Person p2 = new Person("李斯", "男", 100);
    p2.showInfo();
  }
}
