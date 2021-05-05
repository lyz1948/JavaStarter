package interfaceDemo;

public class PanPanDoor extends Door implements Alarm {

  @Override
  public void openDoor() {
    System.out.println("开门");
  }

  @Override
  public void closeDoor() {
    System.out.println("关门");
  }

  @Override
  public void alarm() {
    System.out.println("小偷来了，快报警");
  }

  public static void main(String[] args) {
    Door door = new PanPanDoor();

    door.openDoor();
    door.closeDoor();
    ((PanPanDoor) door).alarm(); // 强制转换

  }
}
