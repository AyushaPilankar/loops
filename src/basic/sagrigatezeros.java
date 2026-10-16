package basic;

public class sagrigatezeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int k = 0;
        for (int i = 0; i < arr.length; i++){

                if (arr[i] != 0) {
                    arr[k] = arr[i];
                    k++;
                }
            }
            for (int j = k; j < arr.length; j++) {

                    arr[k] = 0;
                    k++;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

