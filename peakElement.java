public class Solution {
    public int findPeakElement(int[] nums) {
        int yolo = 0; int flag=0;
        if(nums.length == 1){
            return 0;
        }
        if(nums.length == 2 && nums[0] < nums[1]){
            return 1;
        }
        for(int i = 1; i <=nums.length-2; i++){
            if (nums[i] > nums[i+1] && nums[i] > nums[i-1]) {
                 yolo = i;
                 flag =1;
            }
        }
        if(flag == 0 && nums[nums.length-1] > nums[nums.length-2]){
            return nums.length-1;
        }
        
        return yolo;
    }
}
