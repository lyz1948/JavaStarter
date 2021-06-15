package annotation;

class Bar<T> {
  private T foo;

  public void setBar(T val) {
    this.foo = val;
  }

  public T getBar() {
    return this.foo;
  }

  public void showMe() {
    System.out.println(this.getBar());
  }
}

public class SuppressWarnning {
  // @SuppressWarnings("unchecked")
  @SuppressWarnings({"unchecked", "deprecation"})
  public static void main(String[] args) {

    Bar bar = new Bar();
    bar.setBar("你好！");
    bar.showMe();

    A a = new A();
    a.showMe();
  }
}
