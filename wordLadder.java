class node{
String word=null;
int step=1;
node(String wordo, int stepo){
    word = wordo;
    step = stepo;
}
}

public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        Queue<node> q = new LinkedList<node>();
        q.add(new node(beginWord,1));
        wordList.add(endWord);
        while(!q.isEmpty()){
            node top = q.remove();
            if((top.word).equals(endWord))
            {
                return top.step;
            }
            char[] arr = beginWord.toCharArray();
            for(int i = 0;i<arr.length;i++){
                for(char j='a';j<='z'; j++ ){
                    char temp = arr[i];
                    if(arr[i]!=j){
                        arr[i] = j;
                    }
                    
                    String newW = new String(arr);
                    if(wordList.contains(newW)){
                        q.add(new node(newW,top.step+1));
                        wordList.remove(newW);
                    }
                    arr[i] = temp;
                }
                
            }
        }
        return 0;
    }
}
