package loops;

public class oddnodivthree {
    //print all odd no divisible by 3 from 1 to 100
    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            if(i%3==0&&i%2 !=0)
                System.out.println(i);


        }

    }
}
