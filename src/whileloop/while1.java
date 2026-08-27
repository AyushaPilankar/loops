package whileloop;

public class while1 {
    // while is whene the condition are more then once
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");

        }

        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;

        }
        //we can make for loop as while loop
        int k = 1;
        for (;k <= 10;) {
            System.out.print(k + " ");
            k++;

        }
        //DO WHILE
        int l = 1;
        do{
            System.out.print(l+ " ");
            l++;

        }while (l<= 10);
        //infinate loop
        for (int i = 1; i <= 10; i--) {
            System.out.print(i + " ");

        }


    }
}
