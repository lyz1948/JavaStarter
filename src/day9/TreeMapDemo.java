package day9;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
  public static void main(String[] args) {

    TreeMap map = new TreeMap();

    map.put(1, "beijing");
    // map.put("2", "Shanghai"); // 键的类型与上一个元素不相同
    map.put(5, "Guangzhou");
    // map.put(null, "Xian"); // 键不允许是null
    map.put(3, "Wuhan");
    // map.put(6, null); // 值不允许是null
    // map.put(null, null); // 键和值都允许是null，相同的键，后面的会覆盖前面的

    Set keys = map.keySet();
    Iterator it = keys.iterator();

    // 遍历元素会自然排序
    while(it.hasNext()) {
      Object obj = it.next();
      System.out.println(obj + "=" + map.get(obj));
    }
  }
}
