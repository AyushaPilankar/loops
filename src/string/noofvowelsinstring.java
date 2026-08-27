package string;
import java.util.Scanner;

public class noofvowelsinstring {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
//            System.out.println(count); u made the mistake

        }
        System.out.println(count);

    }
}
