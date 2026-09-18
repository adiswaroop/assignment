import java.util.Arrays;
import java.util.List;

public class Counting {
    public static List<Character> characters = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public static int[] count(String s) {
        int countV = 0;
        int countC = 0;
        s = s.toLowerCase();
        for (int i = 0; i<s.length(); i++) {
            if (characters.contains(s.charAt(i))) countV++;
            else if (Character.isLetter(s.charAt(i))){
                countC++;
            }
        }

        return new int[]{countV, countC};
    }

    public static void main(String[] args) {
        String s = new String("S ta tic");
        int[] c = count(s);
        System.out.printf("\nNumber of Vowels: %d and Number of Constants: %d\n", c[0], c[1]);
    }
}
