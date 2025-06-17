public class Main{
    public static void main(String[] args){
        int[] nums = {25,75,100,125};
        int count = 0;
        for (int i =0;i<nums.length;i++){
            if(nums[i]%2==0){
                count = count+1;
            }
        }
        System.out.println(count);
    }
}