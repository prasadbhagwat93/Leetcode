public class Solution {
    public List<String> damn = new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
     
     generate(n,0,"",damn);
     return damn;
    }
    
     public void generate(int open, int closed, String Os, List<String> as) {
         if(open == 0 && closed == 0 )
         {
             as.add(Os);
         }
         if(open > 0){
             generate(open-1, closed+1, Os+"(", as );
         }
         if(closed > 0){
              generate(open, closed-1, Os+")", as );
         }
     }
    
}
