package basic;

import static java.lang.Math.max;

public class maxofsubarray {
    public static void main(String[] args){
        int[] arr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n=arr.length;
        int maxsum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        //using the brutforce approch
        for (int i = 0; i <n; i++) {
            int currsum=0;
            for (int j = i; j < n; j++) {
                currsum+=arr[j];
               if(currsum>maxsum) {
                   maxsum = currsum;
                   start = i;
                   end = j;
               }

            }

        }
        System.out.println(maxsum);
        System.out.println("subarray= ");
        for (int i =start; i <=end ; i++) {
            System.out.println(arr[i]);

        }

    }
}
