public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[nums.length-1] < target){
            return nums.length;
        }
       int m = search(nums,target);
       if(m == 0){
           for(int i=0; i< nums.length; i++){
               if(nums[i] >= target){
                   m = i;
                   break;
               }
           }
       }
       return m;
        
    }
    
    public int search(int[] nums, int target) {
        int l=0; int r = nums.length-1;
        while(l<=r){
            int k = (l+r)/2;
            if(nums[k] == target){
            return k;
            }
            else if(nums[k]<target){
                l=k+1;
            }
            else{
                r = k-1;
            }
            
        }
      return 0;  
    }
    
}
