package day17;

public class InterfaceDemoo {
  public static void main(String[] args) {
    Class<?> c = null;

    try {
      c = Class.forName("day17.Person");
      Class[] interfaces = c.getInterfaces();

      for (int i = 0; i < interfaces.length; i++) {
        System.out.println(interfaces[i].toGenericString());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
