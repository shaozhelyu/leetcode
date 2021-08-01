import java.util.HashSet;

public class LongestSeq {
    public LongestSeq(){}
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int out = 0;
        for(int i:s){
            if(!s.contains(i-1)){
                int count = 1;
                int m = i+1;
                while(s.contains(m)){
                    count++;
                    m=m+1;
                }
                out = Math.max(out,count);
            }
        }
        return out;
    }
}
