public class Duplicates {

    public static boolean findDuplicates(int[] arr) {
        int res = 0;
        for (int i=0; i<arr.length-1; i++) {
            res = arr[i];
            for (int j = i+1; j<arr.length; j++) {
                if (res == arr[j]) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,7,5};
        boolean res = findDuplicates(a);
        System.out.printf("\nDuplicates found: %b\n", res);
    }
}
