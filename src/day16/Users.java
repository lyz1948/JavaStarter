package day16;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable {

  private String name;
  transient private String password;
  private int money;
  private int experience;
  private Date regTime;

  public Users() {}

  public Users(String name, String password, int money, int experience, Date regTime) {
    this.name = name;
    this.password = password;
    this.money = money;
    this.experience = experience;
    this.regTime = regTime;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public int getExperience() {
    return experience;
  }

  public void setExperience(int experience) {
    this.experience = experience;
  }

  public Date getRegTime() {
    return regTime;
  }

  public void setRegTime(Date regTime) {
    this.regTime = regTime;
  }


  public String toString() {
    return "name:" + this.name + "\npassword: " + this.password + "\nmoney: " + this.money + "\nexperience:" + this.experience + "\nregister time:" + this.regTime;
  }
}
