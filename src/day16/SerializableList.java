package day16;

import java.io.*;
import java.util.Date;

public class SerializableList {
  private File file;
  private ObjectOutputStream out;
  private ObjectInputStream in;

  public SerializableList(File file) throws Exception{
    this.file = file;
    out = new ObjectOutputStream(new FileOutputStream(file));
    in = new ObjectInputStream(new FileInputStream(file));
  }

  // 序列化对象
  public void writeObjects(Object[] objs) {
    try {
      this.out.writeObject(objs);
      this.out.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  // 反序列化对象
  public void readObjects() {

    try {
      Users[] users = (Users[])this.in.readObject();
      for (Users user: users) {
        System.out.println(user);
      }
      this.in.close();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  public static void main(String[] args) {

    Users[] users = {
      new Users("韩信", "111111", 50000, 10000, new Date()),
      new Users("白起", "222222", 40000, 9000, new Date()),
      new Users("卫青", "333333", 30000, 8000, new Date()),
      new Users("霍去病", "444444", 35000, 7500, new Date()),
    };

    File file = new File(File.separator + "Users" + File.separator + "lyz" + File.separator + "user.dat");

    try {
      SerializableList sl = new SerializableList(file);
      // 序列化对象数组
      sl.writeObjects(users);

      // 反序列化对象数组
      sl.readObjects();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
