public class PracticeLabThree {
    public static void main(String[] args) {
        RemoveCharacter("Average`", 'a');
    }

    public static void RemoveCharacter(String word, char RemChar) {

        // wors is manipulated in to a character array
        char[] c = word.toLowerCase().toCharArray();
        // created an empty string
        String newStr = "";
        // began looping through the character array created above
        for (int i = 0; i < c.length; i++) {
            if (c[i] != ((int) RemChar))
                newStr += c[i];
        }
        System.out.println(newStr);
    }

}
