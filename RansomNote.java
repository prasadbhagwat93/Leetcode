public class Solution {
    public int ram = 0;
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] a = new int[100];
        for(int i=0; i<magazine.length();i++ ){
            a[(int)magazine.charAt(i) - 'a'] =   a[(int)magazine.charAt(i) - 'a']+1;    
        }
        
         for(int i=0; i<ransomNote.length();i++ ){
            a[(int)ransomNote.charAt(i) - 'a'] =   a[(int)ransomNote.charAt(i) - 'a']-1;
            if(a[(int)ransomNote.charAt(i) - 'a']<0){
                return false;
            }
        }
        return true;
    }
    
}
