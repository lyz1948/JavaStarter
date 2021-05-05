package day1;

public class TypeConvert {
  public static void main(String[] args) {
    int num = 100;
    double b = num; // 无序数据类型转换
    System.out.println(b);

    double b2 = 123.456;
    int n2 = (int)b2;
    System.out.println(n2); // 不遵循四舍五入

    char c = 'A';
    int n3 = c;
    System.out.println((char)(n3+32));
  }
}
