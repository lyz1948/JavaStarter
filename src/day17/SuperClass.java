package day17;

import java.util.concurrent.Callable;

public class SuperClass {
  public static void main(String[] args) {
    Class<?> c = null;

    try {
      c = Class.forName("day17.Person");
      Class sc = c.getSuperclass();

      System.out.println(sc);
    } catch( Exception e) {
      e.printStackTrace();
    }
  }
}
