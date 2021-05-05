package day4;

import java.util.Scanner;

class Users {
  String username;
  String password;

  Users(String username, String password) {
    this.username = username;
    this.password = password;
  }

}

public class Login {
  Users user;

  public boolean userLogin(String username, String password) {
    if (this.user.username.equals(username) && this.user.password.equals(password)) {
      return true;
    }
    return false;
  }

  public void setUser(Users user) {
    this.user = user;
  }

  public static void main(String[] args) {
    String username;
    String password;
    int maxCount = 0;
    boolean logined = false;

    System.out.println("-------------用户注册------------");

    System.out.println("place input username to register");
    Scanner input = new Scanner(System.in);
    username = input.next();

    System.out.println("place input your password");
    password = input.next();

    Users user = new Users(username, password);
    Login demo = new Login();
    demo.setUser(user);

    System.out.println("register successfully!");


    System.out.println("-------------用户登录------------");
    do {
      System.out.println("username");
      username = input.next();
      System.out.println("password");
      password = input.next();

      logined = demo.userLogin(username, password);
      if (logined) {
        break;
      }

      maxCount++;
      if (maxCount >= 3 && logined == false) {
        System.out.println("登录失败次数超过3次，系统将自动退出");
        System.exit(0);
      }

    } while (true);
    System.out.println("Login Successfully");
  }

}
