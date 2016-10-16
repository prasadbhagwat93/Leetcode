public class Solution {
    public int majorityElement(int[] nums) {
        int k = 0;
        HashMap map = new HashMap();
        for(int i = 0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int val = (int) map.get(nums[i]);
                val = val+1;
                map.put(nums[i],val);
            }
        }
        int n = nums.length/2;
        Set set = map.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry m = (Map.Entry) it.next();
            if((int)m.getValue() >n){
               k= (int) m.getKey();
            }
        }
        return k;
    }
}
