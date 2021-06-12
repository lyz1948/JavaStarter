package day17;

import java.lang.reflect.Array;

public class ArrayDemo {
  public static void main(String[] args) {

    Person[] persons = new Person[] {
      new Person("韩信", 30),
      new Person("白起", 25),
      new Person("卫青", 23),
      new Person("霍去病", 35),
    };

    System.out.println("获取对象数组的长度：" + Array.getLength(persons));

    Class c = persons.getClass();
    System.out.println(c.isArray());
    Class c2 = Person.class;
    System.out.println(c2.isArray());

    for (int i = 0; i < Array.getLength(persons); i++) {
      System.out.println(Array.get(persons, i));
    }
  }
}
