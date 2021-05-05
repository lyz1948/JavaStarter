package day8;

public class RuntimeDemo {
  public static void main(String[] args) {
    Runtime rt = Runtime.getRuntime();
    Process p;
    try {
      p = rt.exec("Notes");
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    System.out.println(rt.freeMemory());
    System.out.println(rt.maxMemory());
    System.out.println(rt.totalMemory());
  }
}
