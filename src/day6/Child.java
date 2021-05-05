package day6;

public class Child extends Parent{

  String name = "I an children";

  Child() {
    System.out.println("Child constructor Child executing");
  }

  Child(String name) {
    super(name);
    System.out.println("Child constructor Child(String) executing");
    this.name = name;
  }

  @Override
  public void showInfo() {
    System.out.println("Children method override");
  }

  public static void main(String[] args) {

    // Child child = new Child();
    // Parent parent = new Child();
    // System.out.println(parent.name); // 不体现多态
    // parent.showInfo(); // 方法体现多态
    Parent parent = new Child("王老三");
    System.out.println(parent.name);
    parent.showInfo();

  }

}
