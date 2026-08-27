package Array;

import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args) {
        int [] a={1,2,3,4};
//        Scanner sc =new Scanner(System.in);
//        int n=sc.nextInt();
        int sum=0;
        for(int i=0; i< a.length; i++){
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
