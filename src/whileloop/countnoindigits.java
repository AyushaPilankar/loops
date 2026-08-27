package whileloop;
import java.util.Scanner;
public class countnoindigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
//        print the sum of digits of no
        int sum=0;
        while(n!=0){
            sum+=(n%10);//we are adding the last digit of no by div by 10 eg=23%10=3
            n=n/10;
        }
        System.out.println(sum);

    }
}
