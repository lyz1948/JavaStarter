package day14;

import java.io.*;

public class FileCopy {

  public static void main(String[] args) throws IOException {
    File src = new File(File.separator + "Users" + File.separator + "lyz" + File.separator + "Downloads" + File.separator + "banner.jpeg");
    File dest = new File(File.separator + "Users" + File.separator + "lyz" + File.separator + "Downloads" + File.separator + "copy.jpeg");

    InputStream in = null;
    OutputStream out = null;

    in = new FileInputStream(src);
    out = new FileOutputStream(dest);

    byte[] buff = new byte[1024];
    int temp;


    try {
      while ((temp = in.read(buff)) != -1) {
        out.write(buff);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      out.close();
      in.close();
    }
  }
}
