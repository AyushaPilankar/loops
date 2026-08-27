package Array;

public class Maxofarray{
    public static void main(String[] args) {
        int [] a={1,2,3,5,7};
        int max=a[0];
        //int max=Integer.MIN_VALUE; we can also initialize  like this
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max)max=a[i];
        }
        System.out.println(max);
        for(int i=0;i<a.length;i++){
            if(a[i]<min)min=a[i];

        }
        System.out.println(min);
    }

}
