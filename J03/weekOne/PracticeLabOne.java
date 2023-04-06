import java.util.Arrays;

public class PracticeLabOne {
    public static void main(String[] args) {

        Max3(23, 345, 43);
        Min3(4, 30, 46);
        Median(123, 54, 76);
        XOR(true, false);
        IsFactor(100, 9);
        IsPerfect(8);
        IsPrime(7);
    }

    public static int Max3(int numOne, int numTwo, int numThree) {
      int[] MyArr = { numOne, numTwo, numThree };

        int Max = MyArr[0];

        for (int i = 0; i < MyArr.length; i++) {
            if (MyArr[i] > Max) {
                Max = MyArr[i];
            }
        }
        // System.out.println(Max);
        return(Max);

    }

    public static int Min3(int numOne, int numTwo, int numThree) {
      int[] MyArr = { numOne, numTwo, numThree };

        int Min = MyArr[0];

        for (int i = 0; i < MyArr.length; i++) {
            if (MyArr[i] < Min) {
                Min = MyArr[i];
            }
        }
        // System.out.println(Min);
        return Min;

    }

    public static int Median(int numOne, int numTwo, int numThree) {
        int max = Max3(numOne, numTwo, numThree);
        int min = Min3(numOne, numTwo, numThree);
        int total = numOne + numThree + numTwo;
        int NewMedian = total - max - min;
        return NewMedian;

        
        // Arrays.sort(MyArr);
        // System.out.println(MyArr[1]);
        // return MyArr[1];


    }

    public static boolean XOR(boolean boolOne, boolean boolTwo) {
        // if (boolOne && boolTwo){
        //     return false;
        // }else{
        //     return (boolOne|boolTwo) ? true:false;
        // }

        return boolOne^boolTwo;
       
     }

    public static boolean IsFactor(int k, int n) {

        boolean factorialize = k%n==0;
       

        return factorialize;
    }

    public static void IsPerfect(int k)  {

        int sum = 0;        
        for(int i = 1;i < k;i++)
        {  
            if(IsFactor(k, i))
            {
                sum+=i;
            }
        }
        System.out.println(sum == k);       
    }

    public static boolean IsPrime(int k) {
        if(k <= 1){
            return false;
        }
       
        for(int i = 2; i <k / 2; i++)
        {
            if(IsFactor(k,i))
            {
                System.out.println(false);
               return false;
            }
            
        } 
        System.out.println(true);
        return true;
        
    } 

}
