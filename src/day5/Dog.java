package day5;

public class Dog extends Animal {
  Dog() {
    System.out.println("a new dog is created");
  }

  @Override
  public void sleep() {
    super.sleep();
    System.out.println("the dog is sleep...");
  }
}
