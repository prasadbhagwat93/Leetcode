public class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length == 1 && nums[0] == 0){
            return 1;
        }
        int sum = 0; int arraysum =0; int res = 0;
       for ( int i=0; i< nums.length; i++){
           sum = sum + i;
           arraysum = arraysum +nums[i];
           if(sum!=arraysum){
               res = i;
           }
       }
       return res;
    }
    
}
