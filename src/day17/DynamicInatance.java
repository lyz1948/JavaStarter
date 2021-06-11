package day17;
/**
 * 动态初始化对象
 */

import java.lang.reflect.Constructor;

public class DynamicInatance {

  public static void main(String[] args) {
    Class<?> c = null;

    try {
      c = Class.forName("day17.Person");
      Constructor constructor = c.getConstructor(new Class[]{String.class, int.class});
      Person p = (Person) constructor.newInstance("zhangshan", 100);
      System.out.println(p);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
