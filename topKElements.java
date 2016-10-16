public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list = new  LinkedList<Integer>();
        Arrays.sort(nums);
        HashMap map = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int val= (int)map.get(nums[i]);
                val = val+1;
                map.put(nums[i],val);
            }
        }
        Set set = map.entrySet();
        Iterator it = set.iterator();
        int[][] min = new int[map.size()][2];
       
        int i =0;
        while(it.hasNext()){
            Map.Entry me= (Map.Entry) it.next();
            min[i][0] =(int) me.getKey();
            min[i][1] = (int)me.getValue();
            i=i+1;
        }
        
        /*Arrays.sort(twoDim, Comparator.comparing((int[] arr) -> arr[0])
                                      .reversed());*/
                                     
    Arrays.sort(min, new Comparator<int[]>() {
    @Override
    public int compare(int[] o1, int[] o2) {
        return Integer.compare(o2[1], o1[1]);
    }
});

int m = 0;
while(m<k){
    list.add(min[m][0]);
    m++;
}
        return list;
    }
}
