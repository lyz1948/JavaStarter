package day18;

import java.sql.*;

public class JDBCDemo2 {

  public static final String url = "jdbc:mysql://127.0.0.1:3306/school";
  public static final String username = "root";
  public static final String password = "mysql123";

  public static Connection conn = null;
  public static Statement stmt = null;
  public static ResultSet rs = null;

  static {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");

      if (conn == null) {
        conn = DriverManager.getConnection(url, username, password);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  // 查询所有
  public static void queryAll() {
    String sql = "select * from students";

    try {
      stmt = conn.createStatement();
      rs = stmt.executeQuery(sql);
      while (rs.next()) {
        System.out.println("学号：" + rs.getInt("id") + ",姓名：" + rs.getString("name") + "，年龄：" + rs.getInt("age") + ",性别：" + rs.getInt("age"));
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  // 添加学生
  public static Boolean add() {
    String sql = "insert into students values(3, 'bob', 24, 'm', 'bob@qq.com')";
    try {
      stmt = conn.createStatement();
      int result = stmt.executeUpdate(sql);

      if (result > 0) {
        return true;
      } else {
        return false;
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      return false;
    }
  }

  // 删除学生
  public static Boolean delete(int id) {
    String sql = "delete from students where id = " + id;
    try {
      stmt = conn.createStatement();
      int result = stmt.executeUpdate(sql);

      if (result > 0) {
        return true;
      } else {
        return false;
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      return false;
    }
  }

  // 更新学生信息
  public static Boolean update(int age) {
    String sql = "update students set age = " + age;
    try {
      stmt = conn.createStatement();
      int result = stmt.executeUpdate(sql);

      if (result > 0) {
        return true;
      } else {
        return false;
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      return false;
    }
  }

  public static void destroyResource() {
    try {
      if (rs != null) {
        rs.close();
        rs = null;
      }
      if (stmt != null) {
        stmt.close();
        stmt = null;
      }

      /*if (conn != null) {
        conn.close();
        conn = null;
      }*/


    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }

  public static void main(String[] args) {

    JDBCDemo2 jdbcDemo2 = new JDBCDemo2();

    jdbcDemo2.queryAll();

    if (jdbcDemo2.add()) {
      System.out.println("添加成功");
    } else {
      System.out.println("添加失败");
    }

    System.out.println("删除id 为2的学习");
    jdbcDemo2.delete(2);
    jdbcDemo2.queryAll();


    System.out.println("更新所有学生的年龄");
    jdbcDemo2.update(30);
    jdbcDemo2.queryAll();
  }
}
