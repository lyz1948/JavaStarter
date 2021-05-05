package practice;

public class BuyChick {
  public static void main(String[] args) {
    int cook; // 公鸡
    int han; // 母鸡
    int chick; // 小鸡

    double totalMoney = 100;
    int totalCount = 100;
    int cookMax = 20;
    int hanMax = 33;
    int chickMax = 100;

    for (cook = 0; cook < cookMax; cook++) {
      for (han = 0; han < hanMax; han++) {
        for (chick = 0; chick < chickMax; chick++) {
          if (chick % 3 == 0) {
            if ((cook + han + chick == totalCount) && (cook * 5 + han * 3 + chick / 3 == 100)) {
              System.out.println("公鸡：" + cook + "只， 母鸡" + han + "只， 小鸡：" + chick + "只");
            }
          }
        }
      }
    }
  }
}
