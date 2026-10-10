package basic;

public class CountEvenNumbers {
    public static void main(String[] args) {
        int count=0;
        int[] arr= {3, 8, 4, 7, 10, 5};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0)
                count++;

        }
        System.out.println(count);

    }
}
