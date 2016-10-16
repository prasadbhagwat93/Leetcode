public class Solution {
    public int[] twoSum(int[] numbers, int target) {
    /*    int[] res = {0 ,0};
       // if(numbers.length == 0 || numbers.length == 1){
         //   return res;
        // }
        
        for(int i =0; i < numbers.length; i++)
        {
            for (int j= 0; j < numbers.length; j++){
            if(numbers[i]+numbers[j] == target){
                res[0] = i+1;
                res[1] = j+1;
                break;
            }
        }
        }
        if(res[0] > res [1]){
            int temp = res [0];
            res[0] = res[1];
            res[1] = temp;
        }
        return res; */
        
        int[] res = {0 ,0};
        Arrays.sort(numbers);
        int i =0; int j = numbers.length-1;
        while (i<j){
            if(numbers[i]+ numbers[j] == target)
            {
                res[0] = i+1;
                res[1] = j+1;
                return res;
            }
            if( numbers[i]+ numbers[j] <target){
                i++;
            }
            if(numbers[i]+ numbers[j] > target)
            {
                j--;
            }
        }
        return res; 
    }
}
