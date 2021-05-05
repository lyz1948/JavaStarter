package day7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleFormatDate {
  public static void main(String[] args) {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");

    Date date = new Date();
    System.out.println(simpleDateFormat.format(date));

    simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss a");

    System.out.println(simpleDateFormat.format(date));

    System.out.println("-------------------");

    simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss a");

    System.out.println(simpleDateFormat.format(date));
  }
}
