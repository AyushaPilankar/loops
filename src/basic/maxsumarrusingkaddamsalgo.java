package basic;

import static java.lang.Math.max;

public class maxsumarrusingkaddamsalgo {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int currmax=0;
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            currmax+=arr[i];
            maxsum=max(currmax,maxsum);
            if(currmax<0){
                currmax=0;
            }


        }
        System.out.println(maxsum);

    }
}
