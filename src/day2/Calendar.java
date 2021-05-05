package day2;

import java.util.Scanner;

public class Calendar {

  public static boolean isLeapYear(int year) {
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      return true;
    }
    return false;
  }

  public static int getMonthDays(int year, int month) {
    int days = 31;

    switch(month) {
      case 4:
      case 6:
      case 9:
      case 11:
        days = 30;
        break;
      case 2:
        if (isLeapYear(year)) {
          days = 29;
        } else {
          days = 28;
        }
        break;
    }
    return days;
  }

  public static int getTotalDays(int year, int month) {
    int totalDays = 0;

    for (int i = 1900; i < year; i++) {
      if (isLeapYear(i)) {
        totalDays += 366;
      } else {
        totalDays += 365;
      }
    }

    for (int i = 1; i < month; i++) {
      totalDays += getMonthDays(year, i);
    }
    return totalDays;
  }

  public static void main(String[] args) {
    int year;
    int month;
    int totalDays;
    int days;
    int monthDays;


    Scanner input = new Scanner(System.in);

    System.out.print("请输入年份：");
    year = input.nextInt();

    System.out.print("请输入月份：");
    month = input.nextInt();

    totalDays = getTotalDays(year, month);
    totalDays++;
    days = totalDays % 7;
    System.out.println("日\t一\t二\t三\t四\t五\t六");

    monthDays = getMonthDays(year, month);

    int count = 0;
    for (int i = 1; i <= days; i++) {
      System.out.print("\t");
      count++;
    }
    for (int i = 1; i <= monthDays; i++) {
      System.out.print(i + "\t");
      count++;
      if (count % 7 == 0) {
        System.out.println();
      }
    }
  }
}
