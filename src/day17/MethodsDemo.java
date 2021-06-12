package day17;

import java.lang.reflect.Method;

public class MethodsDemo {

  public static void main(String[] args) {
    Class<?> c = null;

    try {
      c = Class.forName("day17.Person");

      // 获取所有公有的方法（包括从父类和继承过来的方法）
      System.out.println("获取所有公有的方法");
      Method[] methods = c.getMethods();

      for (int i = 0; i < methods.length; i++) {
        System.out.println(methods[i].toGenericString());
      }

      System.out.println("获取所有的成员方法");
      methods = c.getDeclaredMethods();

      for (int i = 0; i < methods.length; i++) {
        System.out.println(methods[i].toGenericString());
      }

      // 获取指定的公有方法
      System.out.println("获取指定的公有方法");
      Method method = c.getMethod("showInfo", String.class);
      System.out.println(method.toGenericString());

      // 调用成员方法
      Person p = (Person) c.newInstance();
      method.invoke(p, "张生");

      // 获取指定的公有、私有方法
      System.out.println("获取指定的公有、私有方法");
      method = c.getDeclaredMethod("doSleep");
      System.out.println(method.toGenericString());

      // 私有方法只能在当前类里面调用
      // method.invoke(p, "doSleep");

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
