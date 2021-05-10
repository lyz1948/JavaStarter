package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerDemo {

  private final static int TYPES = 13;
  private static String[] roles = { "黑桃♠", "红桃♥", "梅花♣" , "方块◇" };

  // 玩家手中的牌
  private static String[] hands = new String[4];
  // 扑克牌
  private static ArrayList<String> pokers = new ArrayList<String>();

  // 初始化发牌方法
  public static void initPoker() {
    for (String role: roles) {
      for (int i = 1; i <= TYPES; i++) {
        String str = "";
        str += i + "";
        if (i == 1) str = "A";
        if (i == 11) str = "J";
        if (i == 12) str = "Q";
        if (i == 13) str = "K";

        pokers.add(role + str);
      }
    }

    for (int i = 0; i < hands.length; i++) {
      hands[i] = "";
    }
  }

  // 给玩家发牌
  public static void playerPoker() {
    for (int i = 0; i < hands.length; i++ ) {
      List<String> temp = pokers.subList(0, TYPES);
      ArrayList<String> list = new ArrayList<String>(temp);

      for (String s: list) {
        hands[i] += s + " ";
      }
      temp.clear();
    }
  }

  public static void main(String[] args) {

    PokerDemo.initPoker();

    for (String poker: pokers) {
      System.out.print(poker + " ");
    }

    System.out.println("");
    System.out.println("-----------打乱顺序----------");

    Collections.shuffle(pokers);
    for (String poker: pokers) {
      System.out.print(poker + " ");
    }

    PokerDemo.playerPoker();

    System.out.println("");
    System.out.println("-----------发牌----------");
    for (int i = 0; i < hands.length; i++) {
      System.out.println(i + "= " + hands[i]);
    }

  }
}
