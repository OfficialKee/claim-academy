import java.util.Arrays;

public class PracticeLabOne {
   public static void main(String[] args) {

    max3(23, 345, 43);
    min3(4, 30, 46);
    median(123, 54, 76);
   }
   public static void max3(int numOne, int numTwo, int numThree) {

    int[]  MyArr = {numOne,numTwo,numThree};

    int Max = MyArr[0];

    for(int i = 0;i< MyArr.length; i++){
        if(MyArr[i]>Max){
            Max=MyArr[i];
        }
    }
    System.out.println(Max);
    
   }
   public static void min3(int numOne, int numTwo, int numThree) {

    int[]  MyArr = {numOne,numTwo,numThree};

    int Min = MyArr[0];

    for(int i = 0;i< MyArr.length; i++){
        if(MyArr[i]<Min){
            Min=MyArr[i];
        }
    }
    System.out.println(Min);
    
   }

   public static void median(int numOne, int numTwo, int numThree) {
    int[]  MyArr = {numOne,numTwo,numThree};
    Arrays.sort(MyArr);
    System.out.println(MyArr[1]);
   }
}
