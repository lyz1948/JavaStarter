package atmDemo;

import java.util.Scanner;

public class ATM {

  private static final Scanner input = new Scanner(System.in);
  private static int chooice;
  private static Account account;

  public static void showMenu() {
    System.out.println("***********欢迎使用XXXX银行ATM系统*************");
    System.out.println("\t1: 开户");
    System.out.println("\t2: 查询余额");
    System.out.println("\t3: 存款");
    System.out.println("\t4: 取款");
    System.out.println("\t5: 修改密码");
    System.out.println("\t6: 退出");
    System.out.print("请选择：");
    chooice = input.nextInt();
  }

  // 开户
  public static void createAccount() {
    account = new Account();
    System.out.println("开户成功, 以下是您的账户信息：");
    System.out.println(account);
  }

  // 查询余额
  public static void showBalance() {
    System.out.println(account);
  }

  public static boolean deposite() {
    System.out.println("请输入存款金额：");
    int number = input.nextInt();
    try {
      if (number <= 0) {
        throw new ATMException("输入存款非法数字");
      } else {
        account.setBalance(account.getBalance() + number);
        System.out.println("存款成功！");
        return true;
      }
    } catch (ATMException ex) {
      System.out.println(ex);
      return false;
    }
  }

  public static boolean draw() {
    System.out.println("请输入取款金额：");
    int number = input.nextInt();
    try {
      if (number <= 0) {
        throw new ATMException("输入取款非法数字");
      } else if (number >= account.getBalance()) {
        throw new ATMException("输入取款金额超出您的存款，余额不足！");
      }
      else {
        account.setBalance(account.getBalance() - number);
        System.out.println("取款成功！");
        return true;
      }
    } catch (ATMException ex) {
      System.out.println(ex);
      return false;
    }
  }

  // 验证密码
  public static boolean validPassword(String password) {
    try {
      if (password == null || password.equals("")) {
        throw new ATMException("密码不能为空！");
      } else if(password.length() != 6) {
        System.out.println("密码长度仅限6位数字");
        return false;
      } else if (!password.equals(account.getPassword())) {
        System.out.println("密码验证不通过");
        return false;
      }
      else {
        return true;
      }
    } catch (ATMException ex) {
      System.out.println(ex);
      return false;
    }
  }

  // 更新密码
  public static void updateAccountPwd() {
    System.out.println("请输入密码");
    String password = input.next();

    if (validPassword(password)) {
      System.out.println("请输入新密码");
      password = input.next();
      account.setPassword(password);
      System.out.println("更新成功");
    }
  }

  public static void main(String[] args) {
    ATM.showMenu();

    do {
      if (chooice == 6) {
        break;
      }
      switch (chooice) {
        case 1:
          ATM.createAccount();
          break;
        case 2:
          ATM.showBalance();
          break;
        case 3:
          ATM.deposite();
          break;

        case 4:
          ATM.draw();
          break;
        case 5:
          ATM.updateAccountPwd();
          break;
      }
      ATM.showMenu();
    } while (chooice != 6);
    System.out.println("感谢使用，欢迎下次光临！");
  }
}
