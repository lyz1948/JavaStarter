package day15;

import java.io.*;

public class FileReadWrite {
  public static void main(String[] args) {
    String str = "青山隐隐水迢迢\r\n秋尽江南草未凋\r\n二十四桥明月夜\r\n玉人何处教吹箫";
    File file = new File(File.separator + "Users" + File.separator + "lyz" + File.separator + "Downloads" + File.separator + "hello.txt");

    Writer out = null;
    Reader in = null;

    try {
      out = new FileWriter(file);
      in = new FileReader(file);

      out.write(str.toCharArray());
      // out.close();
      out.flush(); // 先不关闭输出流，把缓存区写入文件

      int ch;

      while ((ch=in.read()) != -1) {
        System.out.print((char) ch);
      }
      in.close();

    } catch (Exception ex) {
      ex.printStackTrace();
    }

  }
}
