package day12;

import java.util.concurrent.atomic.AtomicInteger;

class A {
  // public static int num = 0;
  public static AtomicInteger num = new AtomicInteger(0);
}

class MyThread implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
      // A.num++;
      A.num.getAndIncrement();
    }
  }
}

public class Test {
  public static void main(String[] args) {
    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();
    MyThread t3 = new MyThread();

    Thread th1 = new Thread(t1);
    Thread th2 = new Thread(t2);
    Thread th3 = new Thread(t3);

    th1.start();
    th2.start();
    th3.start();

    try{
      th1.join();
      th2.join();
      th3.join();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    System.out.println("A = " + A.num);
  }
}
