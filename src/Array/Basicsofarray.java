package Array;

public class Basicsofarray {
    public static void main(String[] args) {
        int[] x={6,8,4,171,5};
        System.out.println(x[4]);
        //updating the array=mutability
        x[3]=90;
        System.out.println(x[3]);//we can change the value of array by this method
        int[] arr =new int[4];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
    }
}
