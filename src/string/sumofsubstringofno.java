package string;

public class sumofsubstringofno {
    public static void main(String[] args) {

        String s = "123";
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                String sub = s.substring(i, j);
                System.out.println(sub);

                int num = Integer.parseInt(sub);

                sum = sum + num;
            }
        }

        System.out.println("Sum = " + sum);
    }
}