package basic;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50};
        int target = 25;
        int i;
        boolean flag = false;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                flag = true;
                System.out.println("target found");
                System.out.println("target=" + i);

            }
        }
        if (flag==false) {
            System.out.println("target not found");

        }
    }
}

