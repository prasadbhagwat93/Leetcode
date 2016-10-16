public class Solution {
    public int[] singleNumber(int[] nums) {
    int[] res = {0,0};
        Arrays.sort (nums);
        int i = 0; int index=0;
        while(i< nums.length-1 && index<2){
            if(nums[i] == nums[i+1]){
                i=i+2;
            }
            else{
                res[index] = nums[i];
                i=i+1;
                index=index+1;
            }
        }
        if(nums[nums.length-1] != nums[nums.length-2]){
            res[1] = nums[nums.length-1];
        }
        return res;
    }
}
