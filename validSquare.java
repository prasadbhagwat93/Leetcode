public class Solution {
    public boolean isPerfectSquare(int num) {
        int rep =1; int res=0; int flag=0;
        if(num == 0 || num ==1 ){
           return true;
        }
        int k = num/2+1;
        while(rep < num){
            res = res + rep;
            rep =rep+2;
            if(res == num){
                flag = 1;
                break;
            }
        }
        
        if(flag==1){
            return true;
        }
        else{
            return false;
        }
    }
}
