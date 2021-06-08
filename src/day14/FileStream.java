package day14;

import java.io.*;

public class FileStream {
  private static String str = "青山隐隐水迢迢\r\n秋尽江南草未凋\r\n二十四桥明月夜\r\n玉人何处教吹箫";
  public static String splitChar = File.separator;

  public static void main(String[] args) {

    File folder = new File(FileStream.splitChar + "Users" + FileStream.splitChar + "lyz");
    File file = new File(folder, "hello.txt");

    OutputStream out = null;
    InputStream in = null;

    try {
      // 写文件
      out = new FileOutputStream(file);
      out.write(str.getBytes());
      out.close();

      // 读文件
      in = new FileInputStream(file);
      byte[] buf = new byte[(int) file.length()];
      in.read(buf);
      String temp = new String(buf);
      System.out.println(temp);
    } catch(Exception ex) {
      ex.printStackTrace();
    }
  }


}
