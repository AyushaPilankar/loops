package whileloop;

import java.util.Scanner;

public class composit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        boolean flag= true;//true means no is prime

        for (int i = 2; i <= n - 1; i++) {
            if(n%i==0) {
                System.out.println("The number is composit ");
                break;
            }

        }
        for (int i = 2; i <= n - 1; i++) {
            if(n%i==0) {
               flag = false;
                break;
            }

        }
        if(flag==false) System.out.println("composit no");
        if(flag==true) System.out.println("prime no");
    }
}
