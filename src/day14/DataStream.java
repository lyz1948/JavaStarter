package day14;

import java.io.*;

public class DataStream {

  public static void main(String[] args) {
    File file = new File(File.separator + "Users" + File.separator + "lyz" + File.separator + "hello.txt");

    DataInputStream din = null;
    DataOutputStream dout = null;

    try {

      din = new DataInputStream(new FileInputStream(file));
      dout = new DataOutputStream(new FileOutputStream(file));

      // 写入java数据类型
      dout.writeInt(12);
      dout.writeBoolean(false);
      dout.writeChar('a');
      dout.writeChars("abc");
      dout.close();

      System.out.println(din.readInt());
      System.out.println(din.readBoolean());
      System.out.println(din.readChar());
      System.out.println(din.readChar());
      System.out.println(din.readChar());
      din.close();

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
