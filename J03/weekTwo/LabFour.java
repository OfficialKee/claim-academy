/**
 * LabFour
 */
public class LabFour {

    public static void main(String[] args) {

    // sumLimit(1, 9);
    // squirrelPlay(59, true);
    // Lottery(10, 0, 10);
    countXX("abcxx");
    stringTimes("hi", 3);
        
    }
// implented mini function to retrun decimal place amount
    public static int sumLimit(int num1, int num2){
        
     int totalPlaces = decPlaces(num1+num2);
     int num1Places = decPlaces(num1);

     if(totalPlaces > num1Places){
        System.out.println(num1);
        return num1;
     }
     else{
        System.out.println(num1+num2);
        return num1+ num2;
     }
    }
// created mini function to count decimal places of number.
    public static int decPlaces(int number) {
        return Integer.toString(number).length();
    }

    public static boolean squirrelPlay(int temperature ,boolean isSummer) {
        if(temperature >= 60 && temperature <=90 && !isSummer){
            System.out.println(true);
                return true;
        }
        else if(temperature >= 60 && temperature <=100 && isSummer){
            System.out.println(true);
            return true;
        }
        else{
            System.out.println(false);
            return false;
        }
        
       
    }

    public static int Lottery(int num1, int num2, int num3) {
        if(num1 == num2 && num2==num3){
            System.out.print(20);
            return 20;
        }
        else if(num1 != num2 && num2 != num3 && num1 != num3){
            System.out.print(10);
            return 0;
        }
        else{
         return 10;
        }
        
        
    }



    public static int countXX(String word) {
        int count = 0;
        
        for (int i = 0; i < word.length()-1; i++) {
            if(word.toCharArray()[i]== 'x'&& word.toCharArray()[i+1]=='x'){
                count++;
            }
            
        }
        System.out.println(count);
        return count;
    }

    public static void stringTimes(String word, int amt) {
        for (int i = 0; i < amt; i++) {
            System.out.print(word);
        }
        
    }
}