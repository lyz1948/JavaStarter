package day3;

public class Student {

  String sid; // 学号
  String name; // 姓名
  int age;
  char gender; // M 男 F 女
  String email;
  String address;

  Student() {
    System.out.println("创建了一个学生");
  }

  Student(String sid, String name, int age, char gender, String email, String address) {
    this();

    this.sid = sid;
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.email = email;
    this.address = address;
  }

  public void doStudy() {
    System.out.println("开始学习了");
  }

  public void doExam() {
    System.out.println("开始考试了");
  }


  public static void main(String[] args) {
    Student student = new Student("S00001", "张飒", 20, 'M', "zf@163.com", "xxxx路");

    student.doStudy();
    student.doExam();
  }
}
