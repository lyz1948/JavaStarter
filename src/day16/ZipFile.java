package day16;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipFile {

  public static void main(String[] args) {
    // 要压缩的目录
    File dir = new File(File.separator + "Users" + File.separator + "lyz" + File.separator +
      "Downloads" + File.separator + "images");

    //  压缩的文件
    File zipFile = new File(File.separator + "Users" + File.separator + "lyz" + File.separator +
      "Downloads" + File.separator + "images.zip");
    // 输出压缩流
    ZipOutputStream zout = null;
    // 输入流，用来读取每个文件
    InputStream zin = null;

    try {
      // 实例化压缩输出流对象
      zout = new ZipOutputStream(new FileOutputStream(zipFile));

      // 遍历需要压缩的目录文件
      File[] files = dir.listFiles();

      // 压缩文件备注
      zout.setComment("I am comment");

      for (int i = 0; i < files.length; i++) {
        zin = new FileInputStream(files[i]);

        // 生成一个压缩实体，压入到压缩文件中
        zout.putNextEntry(new ZipEntry(files[i].getName()));

        int temp = 0;

        while ((temp = zin.read()) != -1) {
          zout.write(temp);
        }
        zin.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        zout.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }
}
