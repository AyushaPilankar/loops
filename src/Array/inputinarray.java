package Array;

import java.util.Scanner;

public class inputinarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of elements");
        int n= sc.nextInt();
        int [] a =new int[n];//we initialize the array
        for (int i = 0; i <n; i++)
             a[i] = sc.nextInt();

        for (int i = 0; i <n ; i++)
            if( a[i]>0) System.out.print(a[i]);


    }
}
