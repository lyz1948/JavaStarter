package day17;

public class MyDinnerProxyDemo {


  public static void main(String[] args) {

    Dinner din = new MyDinner();
    // 正常调用
    System.out.println("正常调用");
    din.eatDinner();


    //  使用代理
    System.out.println("使用代理");
    MyDinnerProxy proxy = new MyDinnerProxy();
    din = (Dinner) proxy.bind(din);
    din.eatDinner();
  }
}
