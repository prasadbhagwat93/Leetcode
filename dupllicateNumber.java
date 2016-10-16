public class Solution {
    public int findDuplicate(int[] nums) {
        int m=0;
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(!s.contains(nums[i])){
                s.add(nums[i]);
            }
            else{
                 m = nums[i];
                break;
            }
        }
        return m;
    }
}
