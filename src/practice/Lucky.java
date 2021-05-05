package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class Lucky {
  public static void main(String[] args) {
    String cardNumber;
    Scanner input = new Scanner(System.in);
    int temp = 0;

    System.out.print("请输入身份证号：");

    cardNumber = input.next();
    BigInteger sid = new BigInteger(cardNumber);

    do {
      temp += sid.mod(new BigInteger("10")).intValue();
      sid = sid.divide(new BigInteger("10"));
      if (sid.intValue() == 0) {
        break;
      }
    } while (true);

    if (temp % 13 == 0) {
      System.out.println("恭喜你中奖了！");
    } else {
      System.out.println("感谢参与");
    }
  }
}
