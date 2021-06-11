package day17;

public class ClassDemo {

  public static void main(String[] args) {
    Class<?> c1 = null;
    Class<?> c2 = null;
    Class<?> c3 = null;
    Class<?> c4 = null;

    // 第一种方式获取
    Person person = new Person();
    person.getClass();

    // 方式2 最常用
    try {
      c2 = Class.forName("day17.Person");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    // 使用.class语法
    c3 = Person.class;

    // 如果是java封装类，使用TYPE语法
    c4 = Integer.TYPE;

    // System.out.println(c1.getName());
    // System.out.println(c2.getName());
    // System.out.println(c3.getName());
    // System.out.println(c4.getName());
  }
}
