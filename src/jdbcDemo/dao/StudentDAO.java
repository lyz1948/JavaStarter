package jdbcDemo.dao;

import jdbcDemo.entity.Student;
import jdbcDemo.utils.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {

  public boolean addStudent(Student s) {
    String sql = "insert into students values(?,?,?,?,?)";
    Connection conn = null;
    PreparedStatement stmt = null;

    try {
      conn = DBHelper.getConnection();
      stmt = conn.prepareStatement(sql);

      stmt.setInt(1, s.getId());
      stmt.setString(2, s.getName());
      stmt.setInt(3, s.getAge());
      stmt.setString(4, s.getGender());
      stmt.setString(5, s.getEmail());

      int result = stmt.executeUpdate();

      if (result > 0) {
        return true;
      } else {
        return false;
      }
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    } finally {
      try {
        stmt.close();
        conn.close();
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
  }
}
