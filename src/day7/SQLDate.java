package day7;

import java.sql.Date;

public class SQLDate {
  public static void main(String[] args) {

    java.util.Date date = new java.util.Date();
    Date sqlDate = new Date(date.getTime());
    System.out.println(sqlDate);
  }
}
