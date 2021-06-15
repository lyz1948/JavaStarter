package day18;

import java.sql.*;

public class JDBCDemo3 {

  public static void main(String[] args) {
    String url = "jdbc:mysql://127.0.0.1:3306/school";
    String username = "root";
    String password = "mysql123";
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    try {
      // 加载驱动
      Class.forName("com.mysql.cj.jdbc.Driver");

      // 建立连接
      conn = DriverManager.getConnection(url, username, password);

      // 创建查询语句
      String sql = "select * from students";
      stmt = conn.createStatement();
      rs = stmt.executeQuery(sql);

      while (rs.next()) {
        // System.out.println("学号：" + rs.getInt("id") + ",姓名：" + rs.getString("name") + "，年龄：" + rs.getInt("age") + ",性别：" + rs.getInt("age"));
        System.out.println("学号：" + rs.getInt(1) + ",姓名：" + rs.getString(2) + "，年龄：" + rs.getInt(3) + ",性别：" + rs.getString(4));
      }


    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        stmt.close();
        rs.close();
        conn.close();
      } catch (SQLException throwables) {
        throwables.printStackTrace();
      }
    }
  }
}
