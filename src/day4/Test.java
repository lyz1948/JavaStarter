package day4;

public class Test {

  public static int getGenderTotal(Students[] studs, char gender) {

    int maleNumber = 0;
    int femaleNumber = 0;

    for (Students s: studs) {

      if (s.gender == 'm' || s.gender == 'M') {
        maleNumber++;
      }

      if (s.gender == 'f' || s.gender == 'F') {
        femaleNumber++;
      }

    }

    return gender == 'm' ? maleNumber : femaleNumber;
  }

  public static int getAverageAge(Students[] stus) {
    int total = 0;
    for (Students s:stus) {
      total += s.age;
    }
    return total / stus.length;
  }


  public static void main(String[] args) {

    Students[] stus = {
        new Students("Joy", 'F', 22),
        new Students("Lee", 'M', 20),
        new Students("Bob", 'M', 16),
        new Students("Jane", 'F', 19),
        new Students("John", 'M', 18),
    };


    for (Students s: stus) {
      s.showInfo();
    }

    int maleNumber = getGenderTotal(stus, 'm');
    System.out.println("男生人数： " + maleNumber);

    int femaleNumber = getGenderTotal(stus, 'f');
    System.out.println("女生人数：" + femaleNumber);

    int totalNumber = getAverageAge(stus);
    System.out.println("班级平均年龄为：" + totalNumber);
  }
}
