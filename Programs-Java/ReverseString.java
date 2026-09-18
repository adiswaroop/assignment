public class ReverseString {

    public static void reverse1(String s) {
        String str = "";
        for (int i = s.length() - 1; i>=0; i--) {
            str += s.charAt(i);
        }
        System.out.println(str);
    }

    public static void reverse2(String s) {
        char[] chars = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] =  chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        String st = new String(chars);
        System.out.printf("\nReversed String: %s\n", st);
    }

   public static void main(String[] args) {
        String st = "static";
        reverse1(st);
        String st2 = "adi";
        reverse2(st2);
   }
}
