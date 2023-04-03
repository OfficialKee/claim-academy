public class JavaPractice {

  public static void main(String[] args) {
    circleFunction(6);
    EvenOrOdd(7);
    decimation(15);
    GetAscii('b');
    integration(15.4);
    LeapOrNot(1904);
  }

  public static void circleFunction(double radius) {

    double area = (radius * radius) * 3.14;

    double circumference = 2 * 3.14 * radius;

    System.out.println("The area of the circle is " + area);

    System.out.println("THe circumference of the circle is " + circumference);

  }

  public static void EvenOrOdd(int number) {

    String result = (number % 2 == 0) ? "Even" : "Odd";

    System.out.println("The number is " + result);
  }

  public static void decimation(int number) {

    System.out.println(((double) number));
  }

  public static void GetAscii(char letter) {
    int ascii = letter;

    System.out.println(letter + " is " + ascii);

  }

  public static void integration(double number) {

    System.out.println(((int) Math.round(number)));

  }

  public static void LeapOrNot(int year) {
    if (year % 4 == 0) {
      int stepTwo = year;
      if (stepTwo % 100 == 0) {
        int stepThree = year;

        if (stepThree % 400 == 0) {
          System.out.println("Its a leap year with 366 days!");
        } else {
          System.out.println("Its a leap year with 366 days!");
        }
      } else {
        System.out.println("Its a leap year with 366 days!");

      }

    } else {
      System.out.println("Its not a leap year it has 365!");
    }

  }

  // How to determine whether a year is a leap year
  // To determine whether a year is a leap year, follow these steps:

  // 1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step
  // 5.
  // 2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to
  // step 4.
  // 3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to
  // step 5.
  // 4. The year is a leap year (it has 366 days).
  // 5. The year is not a leap year (it has 365 days).

}
