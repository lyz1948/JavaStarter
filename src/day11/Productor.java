package day11;

public class Productor implements Runnable {
  private Kitchen kitchen;

  Productor(Kitchen kitchen) {
    this.kitchen = kitchen;
  }

  @Override
  public void run() {
    while(true) {

      if (kitchen.isDone()) {
        break;
      }

      try {
        kitchen.make(); // 做面包
        Thread.sleep(100);
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }

    System.out.println("今年的任务完成了");
  }
}
