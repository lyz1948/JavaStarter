package day4;

class Book {
  String name;
  String author; // 作者
  String press; // 出版社
  String leader; // 借书人

  Book(String name, String author, String press) {
    this.name = name;
    this.author = author;
    this.press = press;
  }

  public void showInfo() {
    System.out.println("书名：" + this.name + "作者：" + this.author + "，出版社" + this.press + "借书人" + this.leader);
  }

}

public class Student {
  String sid;
  String name;
  int age;

  Student(String sid, String name, int age) {
    this.sid = sid;
    this.name = name;
    this.age = age;
  }

  public void leadBook(Book book) {
    book.leader = this.name;
  }

  public static void main(String[] args) {
    Student s = new Student("s0001", "李翔", 30);
    Book book = new Book("java编程进阶", "李明", "中信出版社");
    book.showInfo();

    System.out.println("-----借书之前-----");
    s.leadBook(book);
    System.out.println("-----借书之后-----");
    book.showInfo();
  }
}
