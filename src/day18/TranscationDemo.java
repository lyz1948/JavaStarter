package day18;

import java.sql.*;

public class TranscationDemo {
  public static void main(String[] args) {
    String url = "jdbc:mysql://127.0.0.1:3306/school";
    String username = "root";
    String password = "mysql123";
    Connection conn = null;
    Statement stmt = null;

    // 保存点
    Savepoint sp = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection(url, username, password);
      stmt = conn.createStatement();

      // 默认不提交事务
      conn.setAutoCommit(false);

      String sql = "insert into students values(9, 'lee@qq.com', 21, 'm', 'lee2')";
      stmt.addBatch(sql);
      sp = conn.setSavepoint();
      stmt.executeBatch();

      sql = "insert into students values(10, 'lee@qq.com', 21, 'm', 'lee3')";
      stmt.addBatch(sql);

      sql = "insert into students values(3, 'lee@qq.com', 21, 'm', 'lee4')";
      stmt.addBatch(sql);

      sql = "update students set age = 100";
      stmt.addBatch(sql);

      conn.commit();

      int[] result = stmt.executeBatch();
      for (int i = 0; i < result.length; i++) {
        System.out.println("第" + (i + 1) + "条批处理受影响的记录" + result[i]);
      }

    } catch (Exception ex) {
      ex.printStackTrace();
      try {
        conn.rollback(sp);
        conn.commit();
      } catch (SQLException throwables) {
        throwables.printStackTrace();
      }
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
