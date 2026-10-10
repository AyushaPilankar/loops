package basic;

public class secondlargestelement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > max) max = arr[i];
        }
        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]>secondmax && arr[i]!=max)secondmax=arr[i];

        }
        System.out.println(secondmax);
    }
}
