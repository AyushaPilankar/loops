package basic;

public class swapping2sortedarrayinplace2 {
    public static void main(String[] args) {
        int[] arr1 = {1,4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};
        int n=arr1.length;
        int m=arr2.length;
        int i=n-1;
        int j=m-1;
        while(i>=0 && j>=0){
            if(arr1[i]>arr2[j]){
                arr1[i--]=arr2[j--];
            }
            else arr1[i]=arr2[j];
        }
        while(j>=0){
            arr1[i--]=arr2[j--];
        }
        System.out.println(java.util.Arrays.toString(arr1));
        System.out.println(java.util.Arrays.toString(arr2));


    }
}
