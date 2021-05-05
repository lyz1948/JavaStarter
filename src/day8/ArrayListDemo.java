package day8;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();

    list.add(42);
    list.add("abc");
    list.add(false);
    list.add("abc");
    list.add(123.45);

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    System.out.println(list.lastIndexOf("abc"));

    System.out.println("--------------迭代器变遍历----------");

    Iterator it = list.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }

    list.clear();
    System.out.println(list.size());
  }
}
