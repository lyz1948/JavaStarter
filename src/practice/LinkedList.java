package practice;

class Students {
  String name;
  int age;

  Students(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void showInfo() {
    System.out.println("姓名：" + this.name + ", 年龄：" + this.age);
  }
}

class Node {
  Students data;
  Node next;

  Node() {

  }

  Node(Students data) {
    this.data = data;
    this.next = null;
  }
}

public class LinkedList {

  public static void init(Students[] stus, Node root) {
    Node temp = root;
    for (Students s: stus) {
      Node node = new Node(s);
      temp.next = node;
      temp = temp.next;
    }
  }

  public static void iterator(Node root) {
    Node temp = root;
    while (temp.next != null) {
      temp = temp.next;
      temp.data.showInfo();
    }
  }

  public static void main(String[] args) {
    Students[] stus = {
        new Students("张生", 30),
        new Students("李四", 40),
        new Students("王五", 34),
    };

    Node root = new Node();
    LinkedList.init(stus, root);
    LinkedList.iterator(root);
  }
}
