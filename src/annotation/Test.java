package annotation;

class Animate {
  public void sleep() {
    System.out.println("动物睡觉的方法");
  }
}

class Person extends Animate{
  @Override
  public void sleep() {
    System.out.println("人躺在床上睡觉");
  }
}

public class Test {
  public static void main(String[] args) {
    Animate a = new Person();
    a.sleep();
  }
}
