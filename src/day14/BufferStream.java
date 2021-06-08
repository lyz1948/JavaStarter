package day14;

import java.io.*;

/**
 * 使用缓存流实现复制
 */
public class BufferStream {

  public static void main(String[] args) throws IOException {
    File src = new File(File.separator + "Users" + File.separator + "lyz" + File.separator + "Downloads" + File.separator + "banner.jpeg");
    File dest = new File(File.separator + "Users" + File.separator + "lyz" + File.separator + "Downloads" + File.separator + "copy.jpeg");

    BufferedInputStream in = null;
    BufferedOutputStream out = null;

    in = new BufferedInputStream(new FileInputStream(src));
    out = new BufferedOutputStream(new FileOutputStream(dest));

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
