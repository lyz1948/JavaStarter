package day6;

public class Parent {

  String name = "I am papa";

  Parent() {
    System.out.println("Parent constructor is Parent() executing ...");
  }

  Parent(String name) {
    System.out.println("Parent constructor is Parent(String) executing....");
  }

  public void showInfo() {
    System.out.println("Parent method");
  }
}
