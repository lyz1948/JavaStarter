package practice;

import java.util.HashMap;
import java.util.Set;

public class Carts {

  // 购物车
  private static HashMap<Books, Integer> carts = new HashMap<Books, Integer>();

  // 加入购物车
  public static void addCart(Books book, int number) {
    carts.put(book, number);
  }

  // 删除购物车书籍
  public static void removeBook(Books book) {
    carts.remove(book);
  }

  public static void showCart() {
    Set<Books> keys = carts.keySet();

    for (Books book: keys) {
      System.out.println(book + "=" + carts.get(book));
    }
  }

  public static void main(String[] args) {
    Books b1 = new Books("红楼梦", "曹雪芹");
    Books b2 = new Books("西游记", "吴承恩");
    Books b3 = new Books("三国志", "罗贯中");
    Books b4 = new Books("水浒传", "施耐庵");
    Books b5 = new Books("水浒传", "施耐庵");

    Carts.addCart(b1, 10);
    Carts.addCart(b2, 20);
    Carts.addCart(b3, 30);
    Carts.addCart(b4, 40);
    Carts.addCart(b1, 50);

    Carts.showCart();

    System.out.println("--------删除购物车---------");
    Carts.removeBook(b1);
    Carts.showCart();
  }
}
