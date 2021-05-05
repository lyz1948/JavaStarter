package day3;

public class Mobile {
  String brand;
  String color;
  double price;

  Mobile() {
    System.out.println("出厂了一个手机");
  }

  Mobile(String brand, String color, double price) {
    this();
    this.brand = brand;
    this.color = color;
    this.price = price;
  }


  public void sendMessage(String message) {
    System.out.println("发送信息：" + message);
  }

  public void callPhone(String phoneNumber) {
    System.out.println("正在打给:" + phoneNumber);
  }

  public static void main(String[] args) {
    Mobile m1 = new Mobile("iphone", "black", 3000);
    Mobile m2 = new Mobile("华为", "white", 4000);
    Mobile m3 = new Mobile("vivo", "red", 3200);

    m1.sendMessage("hello, i am iphone");
    m2.callPhone("13789876789");
    m3.sendMessage("我的vivo手机");
  }
}
