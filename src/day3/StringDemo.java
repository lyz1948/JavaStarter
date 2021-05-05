package day3;

import java.util.StringTokenizer;

public class StringDemo {

  public static void main(String[] args) {

    String s1 = "hello world world";
    String s2 = "hello world";

    String s3 = new String("hello Java");
    String s4 = new String("hello Java");

    System.out.println(s1 == s2); // true
    System.out.println(s3 == s4); // false no same object

    String s5 = "hell chian";
    String s6 = "宝马|奥迪|保时捷|法拉利";
    String s7 = "BAIDU";

    System.out.println(s1.compareTo(s5)); //
    System.out.println(s1.charAt(7));
    System.out.println(s1.concat(s5));
    System.out.println(s1.contains("hello"));
    System.out.println(s1.equals(s2)); // 比较2个对象内容是否相同
    System.out.println(s3.equals(s4));
    byte[] arr = s1.getBytes();
    System.out.println(s1.indexOf("world"));
    System.out.println(s1.lastIndexOf("world"));
    System.out.println(s1.toUpperCase());
    System.out.println(s7.toLowerCase());
    System.out.println(s1.substring(6, 11));
    String[] cars = s6.split("\\|");

    StringTokenizer st = new StringTokenizer(s6, "|");
    while(st.hasMoreElements()) {
      System.out.print(st.nextElement() + " ");
    }

    for (int i = 0; i < cars.length; i++) {
      System.out.print(cars[i] + " ");
    }
  }
}
