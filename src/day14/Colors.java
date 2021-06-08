package day14;

public enum Colors {

  // 直接定义枚举常量
  RED("红色"),GREEN("绿色"),BLUE("蓝色"),YELLOW("黄色"),WHITE("白色"),BLACK("黑色");
  private String name;

  Colors() {
    System.out.println("创建了一种颜色");
  }

  Colors(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  // public static void main(String[] args) {
  //   Colors color = new Colors();
  // }
}
