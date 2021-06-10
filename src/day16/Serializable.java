package day16;

import java.io.*;
import java.util.Date;

public class Serializable {

  public static void main(String[] args) {
    ObjectInputStream in = null;
    ObjectOutputStream out = null;

    String fileName = File.separator + "Users" + File.separator + "lyz" + File.separator + "user.dat";
    Users user = new Users("韩信", "111111", 50000, 10000, new Date());

    try {

      out = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
      in = new ObjectInputStream(new FileInputStream(new File(fileName)));

      // 通过序列化写入对象
      out.writeObject(user);

      // 通过反序列化读出对象
      Users temp = (Users) in.readObject();
      System.out.println(temp);

    } catch (Exception ex) {
      ex.printStackTrace();
    }


  }
}
