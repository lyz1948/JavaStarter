package day4;

public class Students {

  String name;
  char gender;
  int age;

  Students() {
    System.out.println("created a new student");
  }

  Students(String name, char gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public void showInfo() {
    System.out.println("姓名：" + this.name + ", 性别：" + this.gender + "， 年龄： " + this.age);
  }
}
