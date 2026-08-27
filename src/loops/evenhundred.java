package loops;

public class evenhundred {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if(i%2==0)
                System.out.print(i+"");
            System.out.println();
            if(i%2!=0)
                System.out.print(i+"");


        }
    }
}
