public class Solution {
    public char findTheDifference(String s, String t) {
       int[] a = new int[26]; int index=0;
       int[] b = new int[26];
       char x ='a';
       int z =(int) x;
       for(int i = 0;i<s.length();i++){
           a[(int)s.charAt(i) - z] = a[(int)s.charAt(i) - z]+1;
       }
       for(int i = 0;i<t.length();i++){
           b[(int)t.charAt(i) - z] = b[(int)t.charAt(i) - z]+1;
       }
       for(int i=0 ;i<26;i++){
           if(a[i] !=b[i]){
               index = i;
           }
       }
       char[] c= Character.toChars(97+index);
       return c[0];
    }
}
