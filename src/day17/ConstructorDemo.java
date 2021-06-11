package day17;

import java.lang.reflect.Constructor;

public class ConstructorDemo {

  public static void main(String[] args) {
    try {
      Class<?> c = Class.forName("day17.Person");

      System.out.println("所有公共构造方法");
      Constructor[] constructors = c.getConstructors();

      for (int i = 0; i < constructors.length; i++) {
        System.out.println(constructors[i].toGenericString());
      }

      System.out.println("获取指定参数类型的公共方法");
      try {
        Constructor constructor = c.getConstructor(new Class[]{String.class, int.class});
        System.out.println(constructor.toGenericString());
      } catch (NoSuchMethodException e) {
        System.out.println("找不到指定类型的构造方法");
      }

      try {
        System.out.println("获取指定参数类型的公共构造方法，不限制访问级别");
        Constructor construct = c.getDeclaredConstructor(new Class[]{int.class});
        System.out.println(construct.toGenericString());
      } catch (Exception e) {
        e.printStackTrace();
      }

      //  获取所有构造方法
      System.out.println("获取所有构造方法");
      constructors = c.getDeclaredConstructors();
      for (int i = 0; i < constructors.length; i++) {
        System.out.println(constructors[i].toGenericString());
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
