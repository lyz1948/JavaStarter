package day11;

public class Kitchen {

  private Bread bread;
  public static int bigNum = 0;
  public static int smallNum = 0;
  public static int  TOTAL_NUM = 20;
  public static int count = 1;

  public Kitchen(Bread bread) {
    this.bread = bread;
  }

  // 做面包的方法
  public synchronized void make() {

    if (!Bread.isFull()) {
      bread.insert(Kitchen.count);
      Kitchen.count++;
      System.out.println("妈妈做好了" + Kitchen.count + "个面包");
      notifyAll(); // 通知小家伙来吃面
    } else {
      System.out.println("锅已装满，小子们，快来吃面包。。。");
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public synchronized void eat() {
    if (!Bread.isEmpty()) {
      int temp = bread.remove();
      System.out.println(Thread.currentThread().getName() + "吃掉了" + temp + "个面包");

      if (Thread.currentThread().getName().equals("bigSon")) {
        bigNum++;
      } else {
        smallNum++;
      }
      notifyAll();
    } else {
      System.out.println("面包吃完了，等待妈妈做面包。。。");
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public boolean isDone() {
    return Kitchen.count >= TOTAL_NUM;
  }
}
