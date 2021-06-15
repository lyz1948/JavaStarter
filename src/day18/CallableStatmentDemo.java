package day18;

import java.sql.*;

public class CallableStatmentDemo {

  public static void main(String[] args) {
    String url = "jdbc:mysql://127.0.0.1:3306/school";
    String username = "root";
    String password = "mysql123";
    Connection conn = null;
    Statement stmt = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection(url, username, password);
      stmt = conn.createStatement();

      // String sql = "{ call myproc(?) }";
      //
      // stmt = conn.prepareCall(sql);
      // stmt.setInt(1, 0);
      // stmt.registerOutParameter(1, Types.INTEGER);
      // stmt.execute();
      // System.out.println(stmt.getInt(1));
      String sql = "insert into students values(6, 'lee@qq.com', 21, 'm', 'lee2')";
      stmt.addBatch(sql);

      sql = "insert into students values(7, 'lee@qq.com', 21, 'm', 'lee3')";
      stmt.addBatch(sql);

      sql = "insert into students values(8, 'lee@qq.com', 21, 'm', 'lee4')";
      stmt.addBatch(sql);

      sql = "update students set age = 100";
      stmt.addBatch(sql);

      int[] result = stmt.executeBatch();
      for (int i = 0; i < result.length; i++) {
        System.out.println("第" + (i+1) + "条批处理受影响的记录" + result[i]);
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
