package day1;

import java.util.Scanner;

public class Judge2 {
  public static void main(String[] args) {
    int score;

    Scanner input = new Scanner(System.in);
    System.out.print("请输入考试成绩：");
    score = input.nextInt();

    if (score > 100 || score < 0) {
      System.out.println("输入有误");
      System.exit(0);
    }

    if (score <= 100 && score >= 90) {
      System.out.println("非常棒");
    } else if (score < 90 && score >= 80) {
      System.out.println("优秀");
    } else if (score < 80 && score >= 60) {
      System.out.println("良好");
    } else {
      System.out.println("不及格");
    }
  }
}
