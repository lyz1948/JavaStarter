package atmDemo;

public class Account {
  private String name; // account name
  private String id;
  private String password;
  private double balance;

  Account() {
    init();
  }

  private void init() {
    this.name = "默认名";
    this.id = "";
    this.password = "888888";
    this.balance = 0.0;

    for(int i = 0; i < 6; i++) {
      int temp = (int)(Math.random() * 100) % 10;
      id+= temp;
    }
  }

  @Override
  public String toString() {
    return "户名：" + this.getName() + "\n卡号：" + this.getId() + "\n余额：" + this.getBalance();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}
