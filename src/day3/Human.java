package day3;

public class Human {
  String name;
  String gender;
  int age;

  // 构造函数
  Human() {
    this.name = "默认值";
    this.gender = "未知";
    this.age = 1;
    System.out.println("又诞生了一位国家总理");
  }

  Human(String name, String gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public void work() {
    System.out.println("开始工作。。。");
  }

  public void study() {
    System.out.println("学习中。。。。");
  }

  public void sleep() {
    System.out.println("休息了");
  }

  public void showInfo() {
    System.out.println("我叫" + this.name + ", 性别：" + this.gender + ", 今年" + this.age + "岁了");
  }

  public static void main(String[] args) {

    Human human = new Human("李斯", "男", 30);
//    human.name = "张怡";
//    human.gender = "男";
//    human.age = 30;

    human.showInfo();
    human.study();
    human.work();
    human.sleep();
  }
}
