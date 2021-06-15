package jdbcDemo.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {
  private static Connection conn; // 连接对象
  private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
  private static final String URL = "jdbc:mysql://127.0.0.1:3306/school";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "mysql123";

  // 静态代码中加载驱动
  static {
    try {
      Class.forName(DRIVER);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // 单例模式，让构造方法私有化
  private DBHelper() {}

  public static Connection getConnection() throws Exception{
    if (conn == null) {
      conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    return conn;
  }
}
