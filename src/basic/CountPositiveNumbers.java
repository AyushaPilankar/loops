package basic;

public class CountPositiveNumbers {
    public static void main(String[] args){
        int count=0;
        int arr[]= {-2, 5, 0, 8, -3, 7, -1, 4};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0)
                count++;

        }
        System.out.println(count);
    }
}
