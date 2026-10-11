package basic;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50};
        int target = 70;
        boolean flag=false ;
        for (int i = 0; i < arr.length; i++) {
         if(arr[i]==target)flag=true;
        }
        if(flag==true) System.out.println("target found");
        else System.out.println("target not found");

    }
}

