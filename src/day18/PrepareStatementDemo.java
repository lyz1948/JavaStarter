package day18;

import java.sql.*;

public class PrepareStatementDemo {

  public static void main(String[] args) {
    String url = "jdbc:mysql://127.0.0.1:3306/school";
    String username = "root";
    String password = "mysql123";
    Connection conn = null;
    PreparedStatement stmt = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection(url, username, password);
      // String sql = "insert into students values(4, 'bob', 24, '男', 'bob@qq.com')";
      String sql = "insert into students values(?, ?, ?, ?, ?)";
      stmt = conn.prepareStatement(sql);

      stmt.setInt(1, 5);
      stmt.setString(2, "艾德蒙");
      stmt.setInt(3, 20);
      stmt.setString(4, "男");
      stmt.setString(5, "aidemeng@qq.com");

      int result = stmt.executeUpdate();

      if (result > 0) {
        System.out.println("添加成功");
      }


    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {

      try {
        stmt.close();
        conn.close();
      } catch (SQLException throwables) {
        throwables.printStackTrace();
      }
    }

  }
}
