public class PracticeLabThree {
    public static void main(String[] args) {
        RemoveCharacter("Average", 'a');
        RemoveDuplicate("mississippi");
        HowManyConsVowels("aaaaaaaabb");
    }

    public static void RemoveCharacter(String word, char RemChar) {

        // wors is manipulated in to a character array
        char[] c = word.toLowerCase().toCharArray();
        // created an empty string
        String newStr = "";
        // began looping through the character array created above
        for (int i = 0; i < c.length; i++) {
            if (c[i] != RemChar)
                newStr += c[i];
        }
        System.out.println(newStr);
    }

    public static void RemoveDuplicate(String word) {
        char[] c = word.toLowerCase().toCharArray();
        String checkerString = "";
        for (int index = 0; index < c.length; index++) {
            if (!checkerString.contains("" + c[index] + "")) {
                checkerString += c[index];
            }
        }
        System.out.println(checkerString);
    }

    public static void HowManyConsVowels(String input) {

        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        char[] consonants = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x',
                'y', 'z' };
        char[] word = input.toLowerCase().toCharArray();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < consonants.length; j++) {
                if (word[i] == consonants[j]) {
                    consonantCount++;
                }

            }
        } 
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (word[i] == vowels[j]) {
                    vowelCount++;
                }

            }

        }
        System.out.println("total consonant: "+consonantCount +" and totals vowels " + vowelCount);

    }
}
