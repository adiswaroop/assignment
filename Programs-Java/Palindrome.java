public class Palindrome {
    public static boolean palindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while (i<j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = new String("adida");
        boolean res = palindrome(s);

        System.out.printf("\nString is palindrome: %b\n", res);
    }
}
