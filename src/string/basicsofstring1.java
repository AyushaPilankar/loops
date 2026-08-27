package string;

import java.util.Scanner;

public class basicsofstring1 {
    public static void main(String[] args) {
        //print the string
        String s="Hi Ayusha";
        System.out.println(s);

        //scanner function in string
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println(s1);
        String t=sc.next();
        System.out.println(t);

        //char at and length of string
        String s3="ayusha";
        System.out.println(s3.charAt(4));
        int n=s3.length();
        System.out.println(n);
    }

}
