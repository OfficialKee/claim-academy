import java.util.Arrays;

public class PracticeLabOne {
    public static void main(String[] args) {

        Max3(23, 345, 43);
        Min3(4, 30, 46);
        Median(123, 54, 76);
        XOR(true, false);
    }

    public static void Max3(int numOne, int numTwo, int numThree) {

        int[] MyArr = { numOne, numTwo, numThree };

        int Max = MyArr[0];

        for (int i = 0; i < MyArr.length; i++) {
            if (MyArr[i] > Max) {
                Max = MyArr[i];
            }
        }
        System.out.println(Max);

    }

    public static void Min3(int numOne, int numTwo, int numThree) {

        int[] MyArr = { numOne, numTwo, numThree };

        int Min = MyArr[0];

        for (int i = 0; i < MyArr.length; i++) {
            if (MyArr[i] < Min) {
                Min = MyArr[i];
            }
        }
        System.out.println(Min);

    }

    public static void Median(int numOne, int numTwo, int numThree) {
        int[] MyArr = { numOne, numTwo, numThree };
        Arrays.sort(MyArr);
        System.out.println(MyArr[1]);
    }

    public static void XOR(boolean boolOne, boolean boolTwo) {
        System.out.println(boolOne != boolTwo);
    
        }

}
