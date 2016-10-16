public class Solution {
 
    public int uniquePaths(int m, int n) {
      int k = factorial((m+n-2))/(factorial(m-1)*factorial(n-1));
      return k;
      
       }
       
      public int factorial (int n){
          if(n==0){
              return 1;
          }
          int i = 1; int res = 1;
        while(i<=n){
            res = res*i;
            i++;
        }
        return res;
}
}
