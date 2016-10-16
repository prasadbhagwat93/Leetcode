public class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        res[0] = 0;
         int pow =1; int p =1;
        for(int i =1; i<= res.length-1; i++){
            if(pow == i){
                res[i] = 1;
                 pow = pow*2;
                p = 1;
            }
            else{
                res[i] = res[p] + 1;
                p++;
            }
        }
        return res;
    }
}
