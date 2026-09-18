public class MaxMinVal {
    public static int[] findMinMax(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array Must not be empty!!");
        }

        int max = a[0];
        int min = a[0];

        for (int i = 1; i< a.length; i++) {
            if (a[i]> max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }
        }
        return new int[]{max,min};
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] result = findMinMax(a);
        System.out.printf("\nMaximum Value: %d \nMinimum Value: %d \n", result[0], result[1]);
    }
}
