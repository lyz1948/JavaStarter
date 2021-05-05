package day8;

public class StringBuff {
  public static void main(String[] args) {

    String s = new String("I love");
    System.out.println(s.hashCode());

    s += " china";
    System.out.println(s.hashCode());

    System.out.println("----------------");

    StringBuffer buff = new StringBuffer("I love");
    System.out.println(buff.hashCode());
    buff.append(" china");
    System.out.println(buff.hashCode());
    System.out.println(buff.reverse());
  }
}
