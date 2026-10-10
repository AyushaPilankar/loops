package basic;

import java.util.Scanner;

public class oddno {
    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int[] arr= sc.nextInt();
        int count=0;
        int[] arr={1,2,3,4};
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2!=0)count++;

        }
        System.out.println(count);
    }
}
