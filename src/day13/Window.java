package day13;

import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

public class Window {

  private String name;

  // 当前队列长度属性，要保证原子性
  private AtomicInteger len = new AtomicInteger(0);

  // 总票数
  public static final int MAX_LEN = 10;

  // 选取一个支持同步的集合类型来当缓冲区
  Vector<Integer> queue = new Vector<Integer>(0);

  Window(String name) {
    this.name = name;
  }

  public int getLen() {
    return this.len.get();
  }

  public String getName() {
    return this.name;
  }

  public synchronized void insert(int number) {
    queue.add(number);
    this.len.getAndIncrement(); // 队列长度+1
  }

  public synchronized int remove() {
    this.len.getAndDecrement(); // 队列长度-1
    return queue.remove(0); // 获取头元素
  }

}
