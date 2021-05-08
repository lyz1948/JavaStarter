package day10;

public class Books {
  String name;
  String press;
  double price;

  Books(String name, String press, double price) {
    this.name = name;
    this.press = press;
    this.price = price;
  }

  public String showInfo() {
    return "书名：" + this.name + ", 出版社："  + this.press + ", 价格：" + this.price;
  }
}
