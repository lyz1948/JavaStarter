package day11;

public class MyThread extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {

      try {
        System.out.println(Thread.currentThread().getName() + " " + i);
        Thread.sleep(300);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}
