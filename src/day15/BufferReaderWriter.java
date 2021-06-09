package day15;

import java.io.*;

public class BufferReaderWriter {


  public static void main(String[] args) throws IOException {
    File src = new File(File.separator + "Users" + File.separator + "lyz" + File.separator + "Downloads" + File.separator + "hello.txt");
    File dest = new File(File.separator + "Users" + File.separator + "lyz" + File.separator + "Downloads" + File.separator + "helloCopy.txt");

    BufferedReader in = null;
    BufferedWriter out = null;

    try {
      in = new BufferedReader(new FileReader(src));
      out = new BufferedWriter(new FileWriter(dest));

      char[] buff = new char[1024];

      while(in.read(buff) != -1) {
        out.write(buff);
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
    finally {
      out.close();
      in.close();
    }

  }
}

