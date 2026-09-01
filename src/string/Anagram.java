//package string;
//import java.util.Arrays;
//import java.util.Scanner;
//public class Anagram {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        String s2=sc.nextLine();
//        System.out.println("Enter the string1"+s);
//        System.out.println("Enter the string2"+s2);
//        char[] arr1=s.toCharArray();
//        char[] arr2=s2.toCharArray();
//        Array.sort(arr1);
//        Array.sort(arr1);
//        if(s.length()==s2.length()){
//            for (int i = 0; i <arr.length ; i++) {
//                if(arr1[1]!=arr2[i]) {
//                    return false;
//                }
//
//            }
//            return true;
//
//        }
//    }
//
//}
package string;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string1:");
        String s = sc.nextLine();

        System.out.println("Enter the string2:");
        String s2 = sc.nextLine();

        char[] arr1 = s.toCharArray();
        char[] arr2 = s2.toCharArray();

        boolean isAnagram = true;

        if (arr1.length == arr2.length) {

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            for (int i = 0; i < arr1.length; i++) {

                if (arr1[i] != arr2[i]) {
                    isAnagram = false;
                    break;
                }
            }

        } else {
            isAnagram = false;
        }

        if (isAnagram) {
            System.out.println("The strings are Anagrams");
        } else {
            System.out.println("The strings are not Anagrams");
        }

        sc.close();
    }
}
