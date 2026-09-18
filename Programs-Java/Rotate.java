// 5. Write a method that rotates an array to the right by a given number of steps.

import java.util.Arrays;

public class Rotate {
    public static void rotate(int[] arr, int steps) {
        int[] a = new int[arr.length];

        for (int i=0; i<a.length; i++) {
            a[(i+steps)%a.length] = arr[i];
        }

        for (int i=0; i<arr.length; i++) {
            arr[i] = a[i];
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(Arrays.toString(a));
        rotate(a, 2);
        System.out.println(Arrays.toString(a));
    }
}
