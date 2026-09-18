import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] a, int[] b) {
        int n = a.length + b.length;
        int[] arr = new int[n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i<a.length &&  j<b.length){
            if (a[i]<=b[j]) {
                arr[k] = a[i];
                i++;
            }else {
                arr[k] = b[j];
                j++;
            }
        k++;
        }

        while (i<a.length) {
            arr[k] = a[i];
            i++;
            k++;
        }

        while (j<b.length) {
            arr[k] = b[j];
            j++;
            k++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] a = {1,3,4,5,8};
        int[] b = {3,7,9};

        System.out.println(Arrays.toString(merge(a, b)));
    }
}
