package day16;

import java.io.*;

public class SequenceStream {

  public static SequenceInputStream mergeFile(SequenceInputStream sin, File file) throws Exception {
    sin = new SequenceInputStream(sin, new FileInputStream(file));
    return sin;
  }

  public static void main(String[] args) {
    File a = new File(File.separator + "Users" + File.separator + "lyz" + File.separator + "README.txt");
    File b = new File(File.separator + "Users" + File.separator + "lyz" + File.separator + "README-copy.txt");
    File mergeFile = new File(File.separator + "Users" + File.separator + "lyz" + File.separator + "merge.txt");
    SequenceInputStream sin = null;

    try {
      FileOutputStream fout = new FileOutputStream(mergeFile);
      sin = new SequenceInputStream(new FileInputStream(a), new FileInputStream(b));
      int temp = 0;

      while ((temp = sin.read()) != -1) {
        fout.write(temp);
      }
      fout.close();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        sin.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
