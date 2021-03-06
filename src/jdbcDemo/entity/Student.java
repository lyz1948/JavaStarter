package jdbcDemo.entity;

public class Student {
  private int id;
  private String name;
  private String gender;
  private int age;
  private String email;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Student() {}

  public Student(int id, String name, String gender, int age, String email) {
    this.id = id;
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.email = email;
  }
}
