public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> a = new HashSet<Integer>();
        for(int i = 0; i< nums1.length; i++){
            if(!set.contains(nums1[i])){
                set.add(nums1[i]);
            }
    }
    for(int i = 0; i< nums2.length; i++){
            if(set.contains(nums2[i])){
               if(!a.contains(nums2[i])) {
               a.add(nums2[i]);
               }
            }
    }
    Iterator it = a.iterator();
    int[] res = new int[a.size()];
    for(int i = 0; i<a.size();i++){
        res[i] = (Integer) it.next();
    }
    return res;
}
}
