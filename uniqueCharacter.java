public class Solution {
    public int firstUniqChar(String s) {
        if(s.equals("")){
            return -1;
        }
    int[] a = new int[26]; int index = -1;
    for(int i =0 ;i<s.length(); i++){
        a[(int)s.charAt(i)-'a'] =  a[(int)s.charAt(i)-'a'] +1;
    }
    for(int i = 0; i< s.length(); i++){
        if(a[(int)s.charAt(i)-'a']==1){
            index =i;
            break;
        }
    }
    if(index>=0){
        return index;
    }
    else{
        return -1;
    }
    
    }
}
