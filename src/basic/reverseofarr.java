package basic;

public class reverseofarr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        int i=0,j=n-1;
         {
                while(j>i){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j--;
                }
            }
        for (int k = 0; k <n ; k++) {
            System.out.println(arr[k]);
        }

    }
}
