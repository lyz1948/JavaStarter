package day11;

import java.util.Stack;

public class Bread {
  Stack<Integer> stack = new Stack<Integer>();
  public static final int MAX_NUM = 10; // 最多做十个面包
  public static int breadNum = 0; // 面包的个数

  // 做面包的方法
  public synchronized void insert(int number) {
    stack.push(number);
    Bread.breadNum++;
  }

  // 取面包的方法
  public synchronized int remove() {
    Bread.breadNum--;
    return stack.pop();
  }

  public static  boolean isFull() {
    return breadNum >= MAX_NUM;
  }

  public static boolean isEmpty() {
    return breadNum <= 0;
  }
}
