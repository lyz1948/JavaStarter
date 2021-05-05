package interfaceDemo;

public class Apple extends Mobile implements AI {

  String brand = "苹果";
  String color;

  Apple(){}

  Apple(String color) {
    this.color = color;
  }


  @Override
  public void internet() {
    System.out.println(this.brand + "上网");
  }

  @Override
  public void office() {
    System.out.println(this.brand + "办公");
  }

  @Override
  public void music() {
    System.out.println(this.brand + "听音乐");
  }

  @Override
  public void powerOn() {
    System.out.println(this.brand + "开机");
  }

  @Override
  public void powerOff() {
    System.out.println(this.brand + "关机");
  }

  @Override
  public void sendMessage() {
    System.out.println(this.brand + "发短信");
  }

  @Override
  public void callPhone() {
    System.out.println(this.brand + "打电话");
  }
}
