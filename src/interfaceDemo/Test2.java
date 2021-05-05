package interfaceDemo;

public class Test2 implements MyInterface3 {
  @Override
  public void showInfo() {

  }

  @Override
  public void getNum() {

  }

  @Override
  public void getTotal() {

  }

  public static void main(String[] args) {
    Test2 test = new Test2();

    System.out.println(test.NUM);
    System.out.println(Test2.NUM);
  }
}
