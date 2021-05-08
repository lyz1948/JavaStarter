package day10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue queue = new LinkedList();
    queue.add(10);
    queue.add(9);
    queue.add(8);
    queue.add(7);
    queue.add(6);

    while (!queue.isEmpty()) {
      System.out.println(queue.remove());
    }
  }
}
