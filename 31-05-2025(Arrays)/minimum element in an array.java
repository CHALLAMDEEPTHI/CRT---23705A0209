public class Main{
    public static void main(String[] args){
       int[] nums = {25,75,100,125};
       int max = nums[0];
       for(int i=1;i<nums.length;i++){
           int value = nums[i];
           if(value>max){
               max=value;
               
           }
        }
        System.out.println("max:"+max);
    }
}