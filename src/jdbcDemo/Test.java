package jdbcDemo;

import jdbcDemo.dao.StudentDAO;
import jdbcDemo.entity.Student;
import jdbcDemo.utils.DBHelper;

import java.sql.Connection;

public class Test {
  public static void main(String[] args) {
    try {
      Connection conn1 = DBHelper.getConnection();
      Connection conn2 = DBHelper.getConnection();

      // 测试是否是单例
      System.out.println(conn1 == conn2);

      Student s1 = new Student(10, "bob", "男", 23, "bob@163.com");

      StudentDAO sdao = new StudentDAO();
      if (sdao.addStudent(s1)) {
        System.out.println("添加成功");
      } else {
        System.out.println("添加失败");
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
