package day1;

public class Judge3 {
  public static void main(String[] args) {

    for (int i = 1; i <= 40; i++) {

      if (i == 10) {
        System.out.println("去接个电话");
        continue;
      }
      System.out.println("跑完第" + i + "圈了");
    }

    System.out.println("回家");
  }
}
