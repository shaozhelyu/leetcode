import java.util.HashMap;

public class mEle {
    public int majorityElement(int[] nums) {
        if(nums.length==1)return nums[0];
        int N = nums.length/2;
        HashMap<Integer,Integer> m = new HashMap<>();
        int n = 0;
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                n = m.get(nums[i]);
                m.replace(nums[i],n+1);
            }else{
                n = 0;
                m.put(nums[i],n+1);
            }
            if(n+1>N){
                return nums[i];
            }

        }
        return 1;
    }
}
