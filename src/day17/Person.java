package day17;

import java.io.Serializable;
import java.lang.reflect.Method;

public class Person implements Serializable {

  private String name;
  private int age;
  public String address;

  public String toString() {
    return "名字：" + this.getName() + ", 年龄：" + this.getAge();
  }

  public Person() {
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  Person(String name) {
    this.name = name;
  }

  private Person(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void showInfo(String name) {
    System.out.println("你好，" + name);
  }

  private void doSleep() {
    System.out.println("休息了");
  }

  public static void main(String[] args) {
    Class<?> c = null;

    try {
      c = Class.forName("day17.Person");
      Method method = c.getDeclaredMethod("doSleep", new Class[]{});
      Person p = (Person) c.newInstance();
      method.invoke(p, null);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
