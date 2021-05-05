package day8;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

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

    list.addFirst("广州");
    list.addLast("深圳");

    System.out.println(list.getFirst());
    System.out.println(list.getLast());
    Iterator it = list.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }

    list.clear();
    System.out.println(list.size());

  }
}
