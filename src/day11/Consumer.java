package day11;

public class Consumer implements Runnable {
  private Kitchen kitchen;

  public Consumer(Kitchen kitchen) {
    this.kitchen = kitchen;
  }

  @Override
  public void run() {

    while (true) {

      if (kitchen.isDone() && Bread.isEmpty()) {
        break;
      }

      try {
        kitchen.eat(); // 吃面包
        Thread.sleep(100);
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }

    System.out.println("面包吃完了");
  }
}
