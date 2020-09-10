import java.util.ArrayList;
import java.util.List;

public class JumpGame2 {
    public JumpGame2(){}
    public int jump(int[] nums) {
        int n = nums.length-1;
        List<Integer> l = new ArrayList<>();
        int end = nums.length-1;
        dp(l,nums,end);
        return l.size();
    }
    public void dp(List<Integer> l,int[] nums,int end){
        if(end==0){
            return;
        }
        for(int i=0;i<end;i++){
            if(nums[i]>=end-i){
                dp(l,nums,i);
            }
        }
    }

}
