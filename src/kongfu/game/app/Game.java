package kongfu.game.app;

import kongfu.game.logic.KongFuMaster;
import kongfu.game.roles.Computer;
import kongfu.game.roles.Player;

import java.util.Scanner;

public class Game {

  public static Scanner input = new Scanner(System.in);
  public static int chooice;
  public static KongFuMaster player;
  public static KongFuMaster computer;
  public static boolean isFirst = true;

  public static void showMenu() {
    System.out.println("**********************************");
    System.out.println("1、令狐冲  2、欧阳锋");
    System.out.print("请选择角色: ");

    chooice = input.nextInt();
  }

  public static void init() {

    switch (chooice) {
      case 1:
        player = new Player("令狐冲");
        computer = new Computer("欧阳锋");
        break;

      case 2:
        player = new Computer("欧阳锋");
        computer = new Player("令狐冲");
        break;
    }

    System.out.println("您选择了" + player.getName());
  }

  public static void beginCompact(KongFuMaster player, KongFuMaster computer) {
    int temp = (int)(Math.random() * 10) % 3;
    temp++;

    switch (temp) {
      case 1:

        if (isFirst) {
          player.commontSkill(computer);
        } else {
          computer.commontSkill(player);
        }
        break;
        case 2:

        if (isFirst) {
          player.bestSkill(computer);
        } else {
          computer.bestSkill(player);
        }
        break;
        case 3:

        if (isFirst) {
          player.secrets(computer);
        } else {
          computer.secrets(player);
        }
        break;
    }

    Game.isFirst = !Game.isFirst;
  }

  public static boolean isComplete() {
    if (Game.player.getBlood() <= 0 || Game.computer.getBlood() <= 0) {
      return true;
    }
    return false;
  }

  public static void fight() {

    do {
      Game.beginCompact(player, computer);
    } while (!Game.isComplete());
  }

  public static void showResult() {
    if (Game.player.getBlood() <= 0) {
      System.out.println("君子报仇十年不晚！");
    } else {
      System.out.println("别羡慕哥，哥只是一个传说");
    }
  }

  public static void main(String[] args) {
    Game.showMenu();
    Game.init();
    Game.fight();
    Game.showResult();
  }
}
