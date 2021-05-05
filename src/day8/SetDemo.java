package day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

  public static void main(String[] args) {
    HashSet set = new HashSet();

    set.add(null);
    set.add(42);
    set.add("abc");
    set.add('A');
    set.add("abc");

    set.remove('A');
    Iterator it = set.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }

}
