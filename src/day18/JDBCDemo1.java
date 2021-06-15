package day18;

import java.sql.*;

public class JDBCDemo1 {

  public static Connection conn = null;
  public static final String url = "jdbc:mysql://127.0.0.1:3306/school";
  public static final String username = "root";
  public static final String password = "mysql123";

  public static void main(String[] args) throws SQLException {

    // 1. 注册驱动
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");

      // 2. 创建连接
      conn = DriverManager.getConnection(url, username, password);

      if (conn != null) {
        System.out.println("数据库连接成功！");
      } else {
        System.out.println("数据库连接失败！");
      }
      // 3. 创建语句
      Statement stat = conn.createStatement();
      String sql = "insert into students values(1, 'lee', 21, 'm', 'lee@11.com')";
      // 4. 执行语句
      int rs = stat.executeUpdate(sql);
      if (rs > 0) {
        System.out.println("添加成功！");
      } else {
        System.out.println("添加失败");
      }

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      // 5. 关闭连接
      if (conn != null) {
        conn.close();
      }
    }
  }
}
