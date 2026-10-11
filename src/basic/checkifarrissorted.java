package basic;

public class checkifarrissorted {
    public static void main(String[] args){
        int[] arr= {3, 8, 4, 7, 10, 5};
        //mistake i commited
//        int i=0,j=i+1;
//        while(i<j){
//            if(arr[i]>arr[j]){
//                System.out.println("not sorted");
//            }
//            i++;
//            j++;
//            break;
//        }
        boolean flag=true;
        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i] > arr[i + 1]) {
                flag = false;
            }

        }

                if (flag = false) System.out.print("not sorted");
                else System.out.print("sorted");

    }
}
