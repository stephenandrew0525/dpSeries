import java.util.*;
class LongestStringChain{
    public int longestStringChain(String[] words){
        Arrays.sort(words,(a,b)->a.length()-b.length());
        int maxLength=0;
        HashMap<String,Integer> map=new HashMap<>();
        for(String word:words){
            int maxChain=1;
            for(int i=0;i<word.length();i++){
                String prevWord=word.substring(0,i)+word.substring(i+1);
                if(map.containsKey(prevWord)){
                    maxChain=Math.max(maxChain,map.get(prevWord)+1);
                }
            }
            map.put(word,maxChain);
            maxLength=Math.max(maxLength,maxChain);
        }
        return maxLength;
    }
}
class Solution{
    public static void main(String[] args) {
        LongestStringChain lsc=new LongestStringChain();
        String[] words={"a","b","ba","bca","bda","bdca"};
        System.out.println(lsc.longestStringChain(words));
    }
}