package day10;

import java.util.ArrayList;

public class Test {
  public static void main(String[] args) {
    ArrayList<Books> list = new ArrayList<Books>();
    // ArrayList list = new ArrayList();

    // list.add('A');
    // list.add(100);
    // list.add(false);

    list.add(new Books("西游记", "人民出版社", 120));
    list.add(new Books("红楼梦", "人民出版社", 190));
    list.add(new Books("三国志", "人民出版社", 160));
    list.add(new Books("水浒传", "人民出版社", 150));

    for (int i = 0; i < list.size(); i++) {
      // Books book = (Books) list.get(i); // 如果不使用泛型，则需要强制转换为books类型
      System.out.println(list.get(i).showInfo());
    }

    System.out.println("-----------forEach------------");
    for (Books book: list) {

      System.out.println(book.showInfo());
    }

    int[] arr = {1, 4, 5, 6, 9};

    for (int i: arr) {
      i++;
      System.out.println(i);
    }

    System.out.println("--------------------");

    for (int i: arr) {
      System.out.println(i);
    }
  }
}
