package practice;

import java.util.Objects;

public class Books {
  private String name;
  private String author;

  public Books(String name, String author) {
    this.name = name;
    this.author = author;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  @Override
  public int hashCode() {
    return this.name.hashCode() + this.author.hashCode();
  }

  @Override
  public boolean equals(Object obj) {

    if (obj instanceof Books) {

      Books book = (Books) obj;

      if (this.name.equals(book.name) && this.author.equals(book.author)) {
        return true;
      } else {
        return false;
      }
    }
    return false;
  }

  public String toString() {
    return "书名：" + this.name + ", 作者：" + this.author;
  }
}
