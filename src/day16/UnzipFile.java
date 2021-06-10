package day16;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipFile {

  public static void main(String[] args) {
    //  压缩的文件
    File zipFile = new File(File.separator + "Users" + File.separator + "lyz" + File.separator +
      "Downloads" + File.separator + "images.zip");    //  压缩的文件
    File zipDir = new File(File.separator + "Users" + File.separator + "lyz" + File.separator +
      "Downloads" + File.separator + "images2");

    OutputStream out = null;
    ZipInputStream zin = null;

    try {
      if (!zipDir.exists()) {
        zipDir.mkdir();
      }
      zin = new ZipInputStream(new FileInputStream(zipFile));

      ZipEntry entry = null;
      while ((entry = zin.getNextEntry()) != null) {
        out = new FileOutputStream(new File(zipDir, entry.getName()));
        int temp = 0;

        while ((temp = zin.read()) != -1) {
          out.write(temp);
        }
        out.close();
      }

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        zin.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }
}
