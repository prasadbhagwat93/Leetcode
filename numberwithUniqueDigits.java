public class Solution {
    public int total = 0;
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0){
            return 1;
        }
        if(n ==1)
        {
            return 10;
        }
        if(n>9)
        {
            return giveNumber(9);
        }
        else if(n>1){
           return countNumbersWithUniqueDigits(n-1) + giveNumber();
        }
        return 0;
    }
    
    public int giveNumber(int num){
        int sum=1;
        if(num>1){
            for(int i=0; i<=num-1; num--) {
                sum= sum*(9-i);
            }
        }
        return sum;
    }
}
