package day1;

public class DoWhileLoop {
  public static void main(String[] args) {
    int i = 0;
    int j = 1;

    do {
      System.out.println(i);
      i++;
    } while (i < 100);

    while(j < 100) {
      System.out.println("j:" + j++);
    }


  }
}
