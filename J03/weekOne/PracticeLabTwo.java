public class PracticeLabTwo {

  public static void main(String[] args) {
    circleFunction(6);
    EvenOrOdd(7);
    decimation(15);
    GetAscii('b');
    integration(15.4);
    LeapOrNot(2001);
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
          System.out.println("Its not a leap year with 365 days!");
        }
      } else {
        System.out.println("Its a leap year with 366 days!");

      }

    } else {
      System.out.println("Its not a leap year it has 365!");
    }

  }

 

}
