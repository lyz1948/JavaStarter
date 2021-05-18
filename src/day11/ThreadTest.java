package day11;

import jdk.nashorn.internal.runtime.ECMAException;

public class ThreadTest {
  public static void main(String[] args) {

    // MyThread th = new MyThread();
    //
    // th.start();
    //
    // for (int i = 0; i < 100; i++) {
    //   try {
    //     System.out.println(Thread.currentThread().getName() + " " + i);
    //     Thread.sleep(200);
    //   } catch (InterruptedException e) {
    //     e.printStackTrace();
    //   }
    // }

    // 面包对象
    Bread bread = new Bread();
    // 厨房对象
    Kitchen kitchen = new Kitchen(bread);
    // 生产者
    Productor p = new Productor(kitchen);
    // 消费者
    Consumer c1 = new Consumer(kitchen);
    Consumer c2 = new Consumer(kitchen);

    // 线程对象
    Thread mother = new Thread(p, "mother");
    Thread bigSon = new Thread(c1, "bigSon");
    Thread smallSon = new Thread(c2, "smallSon");

    // 启动线程
    mother.start();
    bigSon.start();
    smallSon.start();

    try {
      mother.join();
      bigSon.join();
      smallSon.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("=====统计结果=====");
    System.out.println("大儿子吃掉" + Kitchen.bigNum);
    System.out.println("小儿子吃掉" + Kitchen.smallNum);
  }
}
