package basic;

public class removingtheduplicates {
    public static void main(String[] args){
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int n=arr.length;
        int k=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==arr[i+1]){
                count++;
                arr[i]=arr[k];
                k++;
                break;
            }
            System.out.print(arr[k]);
        }
    }

}
