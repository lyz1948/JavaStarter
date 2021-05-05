package day8;

import java.util.HashSet;
import java.util.Iterator;

class People {
  String name;
  int age;

  People(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return "名字：" + this.name + ",年龄：" + this.age;
  }

  @Override
  public int hashCode() {
    return this.name.hashCode() + this.age;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Person) {
      Person p = (Person) obj;

      if (this.name.equals(p.name) && this.age == p.age) {
        return true; // 返回true不会重复添加
      } else {
        return false;
      }
    } else {
      return false;
    }
  }
}

public class Test {


  public static void main(String[] args) {
    HashSet set = new HashSet();

    set.add(new People("韩信", 30));
    set.add(new People("白起", 20));
    set.add(new People("韩信", 30));

    Iterator it = set.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
