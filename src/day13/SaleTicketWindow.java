package day13;

import java.util.concurrent.atomic.AtomicInteger;

public class SaleTicketWindow {

  private Window window;
  private AtomicInteger saleNum = new AtomicInteger(0); // 每个窗口的售票数量
  public static final int MAX_NUM = 1000; // 每天售卖的最大票数
  public static AtomicInteger count = new AtomicInteger(0); // 所有售票窗口售票的数量统计

  public SaleTicketWindow(Window window) {
    this.window = window;
  }

  // 排队买票的方法
  public synchronized void busTicket() {
    // 当前排队人数小于窗口最大接待人数
    if (window.getLen() < Window.MAX_LEN) {
      // 判断票是否已售完
      if (SaleTicketWindow.count.get() >= SaleTicketWindow.MAX_NUM) {
        notify(); // 唤醒售票窗口
        return;
      }

      SaleTicketWindow.count.getAndIncrement(); // 票数累加
      window.insert(SaleTicketWindow.count.get());
      System.out.println(window.getName() + "第" + SaleTicketWindow.count + "个游客等待买票");

    } else {
      System.out.println(window.getName() + "窗口排队人数已满，等待" + window.getName() + "售票");
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}
