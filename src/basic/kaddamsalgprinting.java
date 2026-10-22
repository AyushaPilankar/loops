package basic;

import static java.lang.Math.max;

public class kaddamsalgprinting {
    public static void main(String[] args) {


        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;

        int currmax = 0;
        int maxsum = Integer.MIN_VALUE;

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < n; i++) {

            currmax += arr[i];

            if (currmax > maxsum) {
                maxsum = currmax;
                start = tempStart;
                end = i;
            }

            if (currmax < 0) {
                currmax = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("Maximum sum = " + maxsum);

        System.out.print("Subarray = ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}

