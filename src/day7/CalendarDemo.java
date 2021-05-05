package day7;

import java.util.Calendar;

public class CalendarDemo {
  public static void main(String[] args) {

    Calendar c = Calendar.getInstance();

    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONDAY);
    int day = c.get(Calendar.DATE);
    int hours = c.get(Calendar.HOUR);
    int minute = c.get(Calendar.MINUTE);
    int second = c.get(Calendar.SECOND);

    System.out.println(year + "/" + month + "/" + day + " " + hours + ":" + minute + ":" + second);
  }
}
