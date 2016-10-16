public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int x = Integer.MAX_VALUE; int y= Integer.MAX_VALUE; int z =0; int flag = 0;
        for(int i =0; i<nums.length; i++){
            z= nums[i];
            if(z < x){
                y =x;
                x = z;
                
            }
            if(z>x && z<y){
                y=z;
                flag =1;
            }
            if(z > y && flag == 1)
            {
                break;
            }
        }
        
        if(x < y ){
            if(y<z){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
