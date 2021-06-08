package day14;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 管道流
 */

class MyWriter implements Runnable {

  private PipedOutputStream pout;

  MyWriter(PipedOutputStream pout) {
    this.pout = pout;
  }

  @Override
  public void run() {
    System.out.println("等待3秒开始写入...");

    try {
      Thread.sleep(3000);

      String str = "hello Java";
      pout.write(str.getBytes());
      pout.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

class MyReader implements Runnable {

  private PipedInputStream pin;

  MyReader(PipedInputStream pin) {
    this.pin = pin;
  }

  @Override
  public void run() {

    int temp;
    try {

      while ((temp = pin.read()) != -1) {
        System.out.print((char) temp);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }

  }
}

public class PipedStream {

  public static void main(String[] args) {

    try {

      PipedOutputStream pout = new PipedOutputStream();
      PipedInputStream pin = new PipedInputStream(pout);

      MyReader r = new MyReader(pin);
      MyWriter w = new MyWriter(pout);

      Thread th_r = new Thread(r);
      Thread th_w = new Thread(w);

      th_r.start();
      th_w.start();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
