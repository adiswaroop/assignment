import java.util.Arrays;

public class Reverse {

    public static int[] reverse(int[] arr) {
        int[] a = new int[arr.length];
        int j = 0;
        for (int i=arr.length-1; i>=0; i--) {
            a[j] = arr[i];
            j++;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(ar)));
    }
}
