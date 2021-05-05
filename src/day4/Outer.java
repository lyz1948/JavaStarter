package day4;

public class Outer {

  String name;

  Outer() {
    System.out.println("outer class constructor");
  }

  Outer(String name) {
    this();
    this.name = name;
  }

  public void showInfo() {
    System.out.println("outer class name is " + this.name);
  }

  class Inner {
    String name;

    Inner() {
      System.out.println("inner class constructor");
    }

    Inner(String name) {
      this();
      this.name = name;
    }

    public void showInfo() {
      System.out.println("inner class name is " + this.name);
    }
  }

  static class Inner2 {
    String name;

    Inner2() {
      System.out.println("inner2 class constructor");
    }

    Inner2(String name) {
      this();
      this.name = name;
    }

    public void showInfo() {
      System.out.println("inner2 class name is " + this.name);
    }
  }

  public void func(String name) {
    class Inner3 {
      String name;

      Inner3() {
        System.out.println("inner3 class constructor");
      }

      Inner3(String name) {
        this();
        this.name = name;
      }

      public void showInfo() {
        System.out.println("inner3 class name is " + this.name);
      }
    }
    new Inner3(name).showInfo();
  }

  public static void method(String name) {
    class Inner4 {
      String name;

      Inner4() {
        System.out.println("inner4 class constructor");
      }

      Inner4(String name) {
        this();
        this.name = name;
      }

      public void showInfo() {
        System.out.println("inner4 class name is " + this.name);
      }
    }
    new Inner4(name).showInfo();
  }


  public static void main(String[] args) {
    Outer outer = new Outer("白起");
    outer.showInfo();

    System.out.println("---------------");

    Inner inner = new Outer().new Inner("韩信");
    inner.showInfo();
    System.out.println("---------------");

    Inner2 inner2 = new Inner2();
    inner2.showInfo();
    System.out.println("---------------");

    outer.func("卫青");
    System.out.println("---------------");

    Outer.method("霍去病");
  }
}
