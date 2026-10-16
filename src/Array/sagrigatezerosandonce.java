package Array;

public class sagrigatezerosandonce {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0};

        int k = 0;

        // Count zeros
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                k++;
            }
        }

        // Place zeros first, then ones
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}