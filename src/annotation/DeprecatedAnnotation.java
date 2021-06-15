package annotation;

class A {
  @Deprecated
  public void showMe() {
    System.out.println("show me");
  }
}

public class DeprecatedAnnotation {

  public static void main(String[] args) {
    A a = new A();
    // 不推荐使用的方法，会显示删除线
    a.showMe();
  }
}
