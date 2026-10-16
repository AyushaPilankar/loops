//package basic;
//this is the wrong code
//public class removingtheduplicates {
//    public static void main(String[] args){
//        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
//        int n=arr.length;
//        int k=0;
//        int count=0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j <n ; j++) {
//                if(arr[i]==arr[j]){
//                    count++;
//                    arr[k]=arr[i];
//                    k++;
//                    break;
//                }
//                else if(arr[i]!=arr[j]){
//                    arr[k]=arr[i];
//                    break;
//
//                }
//
//            }
//        }
//        for (int i= 0; i< k; i++) {
//            System.out.print(arr[i]);
//        }
//        System.out.print(count);
//    }
//
//}
package basic;

public class removingtheduplicates {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

        int n = arr.length;
        int k = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[k - 1]) {
                arr[k] = arr[i];
                k++;
            }
        }

        System.out.println("Unique elements:");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nNumber of unique elements: " + k);
    }
}
