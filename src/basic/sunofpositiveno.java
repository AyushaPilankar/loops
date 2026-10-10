package basic;

public class sunofpositiveno {
    public static void main(String[] args) {
        int sum=0;
        int[] arr = {-2, 5, 0, 8, -3, 7, -1, 4};
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>0)sum+=arr[i];

        }
        System.out.println(sum);
        sumofneg();
    }
    static void sumofneg(){
        int sum=0;
        int[] arr = {-2, 5, 0, 8, -3, 7, -1, 4};
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] < 0) sum += arr[i];
        }
        System.out.println(sum);

    }
}
