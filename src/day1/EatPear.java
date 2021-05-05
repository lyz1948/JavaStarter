package day1;

public class EatPear {
  public static void main(String[] args) {
    int totalPear = 1;
    int day = 10;

    while(day > 1) {
      totalPear = (totalPear+1) * 2;
      day--;
    }
    System.out.println(totalPear);
  }
}
