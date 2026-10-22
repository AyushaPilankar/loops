package basic;

public class swapping2sortedarrayinplace {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};
        int i,j;
        for (i = 0; i <arr1.length-1 ; i++) {
            for (j = 0; j <arr2.length ; j++) {
                if(arr2[j]<arr1[i]){
                    int temp=arr1[i];
                    arr1[i]=arr2[j];
                    arr2[j]=temp;
                }
            }


        }
        System.out.println(java.util.Arrays.toString(arr1));
        System.out.println(java.util.Arrays.toString(arr2));
//        for (int k = 0; k < arr1.length; k++) {
//            System.out.println(arr1[k]);
//        }
    }
}
