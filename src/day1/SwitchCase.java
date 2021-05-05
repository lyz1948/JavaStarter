package day1;

import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args) {
    int score;

    Scanner input = new Scanner(System.in);

    System.out.print("请输入考试成绩：");

    score = input.nextInt();

    if (score > 100 || score < 0) {
      System.out.println("输入有误");
      System.exit(0);
    }

    switch (score/10) {
      case 10:
      case 9:
        System.out.println("非常棒！");
        break;

      case 8:
        System.out.println("优秀！");
        break;
      case 7:
        System.out.println("良好！");
        break;

      case 6:
        System.out.println("及格！");
        break;
      default:
        System.out.println("不及格");
    }
  }




}
