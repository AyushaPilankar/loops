package basic;

public class target {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int n=nums.length;
        boolean flag=false;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if (nums[i] + nums[j] == target) flag = true;
                if (flag == true) System.out.println(i+" "+j);
                break;
            }
            if(flag){
                System.out.println("target not found");
                break;
            }
        }
    }
}
