package day14;

import java.io.File;
import java.io.IOException;

public class FileDemo {

  private static String splitChar = File.separator;

  public static void main(String[] args) {
    // File file = new File("/Users/lyz/test.txt");
    System.out.println(FileDemo.splitChar);
    File folder = new File(FileDemo.splitChar + "Users" + FileDemo.splitChar + "lyz" + FileDemo.splitChar + "haha" + FileDemo.splitChar + "bb");
    File file = new File(folder, "hello.txt");

    // file.mkdir(); // 创建目录

    try {
      if (!folder.exists()) {
        // folder.mkdir();
        folder.mkdirs();
        file.createNewFile();
        System.out.println("目录文件创建成功");
      } else {
        file.createNewFile();
        System.out.println("文件创建成功");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    // 等待10秒
    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep(1000);
      } catch(Exception ex) {
        ex.printStackTrace();
      }
    }

    file.delete();
    System.out.println("文件删除完成");

    System.out.println("绝对路径" + file.getAbsoluteFile());
    System.out.println("文件名：" + file.getName());
    System.out.println("父目录：" + file.getParent());
    System.out.println("是否是目录：" + file.isDirectory());
    System.out.println("文件长度：" + file.length());

    // System.out.println(File.pathSeparator);
    // System.out.println(File.pathSeparatorChar);
    // System.out.println("系统默认分隔符：" + File.separator);
  }
}
