package day17;

import java.lang.reflect.Field;

public class FieldDemo {

  public static void main(String[] args) {

    try {
      Class<?> c = null;
      c = Class.forName("day17.Person");

      // 获取所有的属性
      System.out.println("获取所有的公有属性");
      Field[] fields = c.getFields();
      for (int i = 0; i < fields.length; i++) {
        System.out.println(fields[i]);
      }

      // 获取所以属性包括私有
      System.out.println("获取所以属性");
      fields = c.getDeclaredFields();

      for (int i = 0; i < fields.length; i++) {
        System.out.println(fields[i].toGenericString());
      }

      // 获取指定名字的公有属性
      System.out.println("获取指定名字的公有属性");
      Field field = c.getField("address");
      System.out.println(field.toGenericString());

      // 获取指定名字的属性
      System.out.println("获取指定名字的属性");
      field = c.getDeclaredField("age");
      System.out.println(field.toGenericString());

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
