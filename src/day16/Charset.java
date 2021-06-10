package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Charset {

  public static void main(String[] args) {
    File file = new File(File.separator + "Users" + File.separator + "lyz" + File.separator + "README.txt");

    InputStream in = null;

    try {
      in = new FileInputStream(file);
      byte[] buff = new byte[(int)file.length()];

      String str = "";

      while (in.read(buff) != -1) {
        // str += new String(buff);
        str += new String(buff, "utf-8");
      }
      System.out.println(str);

    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
      try {
        in.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
