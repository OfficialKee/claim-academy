public class PracticeLabOne {
   public static void main(String[] args) {

    max3(23, 345, 43);
    
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
}
