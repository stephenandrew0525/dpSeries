import java.util.*;
class LongestIncSubs{
    public int longestIncSubs(int[] nums){
        List<Integer> list =new ArrayList<>();
        for(int num:nums){
            int pos=Collections.binarySearch(list,num);
            if(pos<0) pos=-(pos+1);
            if(pos==list.size()){
                list.add(num);
            }
            else{
                list.set(pos,num);
            }

        }
        return list.size();
    }
}
class Solution{
    public static void main(String[] args) {
        LongestIncSubs lis = new LongestIncSubs();
        int[] nums={10,9,2,5,3,7,101,18};
        System.out.println(lis.longestIncSubs(nums));
    }

}