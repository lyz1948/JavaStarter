package day8;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
  public static void main(String[] args) {
    LinkedHashSet set = new LinkedHashSet();

    set.add("apple");
    set.add("banana");
    set.add("orange");
    set.add("pear");
    set.add("pear"); // 无法添加相同元素
    set.add(null); // 允许添加Null

    Iterator it = set.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
