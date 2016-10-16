public class Solution {
    public boolean isSubsequence(String s, String t) {
        int is =0, it=0;
        while(is<s.length() &&it<t.length() ){
            char a=s.charAt(is);
            char b=t.charAt(it);
            if(a==b){
                is = is+1;
                it = it+1;
            }
            else{
                it = it +1;
            }
        }
        return is == s.length();
    }
}
