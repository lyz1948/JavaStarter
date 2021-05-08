package day10;

public class A<T> {
  private T obj;

  A(T obj) {
    this.obj = obj;
  }

  public void showType() {
    System.out.println("对象的类型是：" + this.obj.getClass().getName()); // 对象类型
  }

  public static void main(String[] args) {
    A queue = new A(100);
    queue.showType();

    queue = new A("abc");
    queue.showType();

    queue = new A(new Books("西游记", "人民文学出版社", 200));
    queue.showType();

  }
}
