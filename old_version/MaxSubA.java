import java.util.ArrayList;
import java.util.List;

public class MaxSubA {
    public MaxSubA(){}
    public int maxSubArray(int[] nums) {
        int n = nums.length-1;
        return dp(nums,0,n);


    }
    public int dp(int[] nums,int s,int e){
        int n = (s+e)/2;
        if(s>=e){
            return nums[s];
        }
        int maxl = dp(nums,s,n-1);
        int maxr = dp(nums,n+1,e);
        int maxML = nums[n-1],temp = nums[n-1];

        for(int i=n-1;i>=s;i--){
            temp = temp + nums[i];
            maxML = Math.max(maxML,temp);
        }
        temp = maxML;
        for(int i = n+1;i<=e;i++){
            temp = temp + nums[i];
            maxML = Math.max(maxML,temp);
        }

        return Math.max(maxML,Math.max(maxr,maxl));
    }
//public int maxSubArray(int[] nums) {
//    int TempMax = nums[0];
//    int FinalMax = nums[0];
//    for (int i = 1; i < nums.length; i++){
//        TempMax = Math.max((TempMax + nums[i]), nums[i]);
//        FinalMax = Math.max(FinalMax, TempMax);
//    }
//    return FinalMax;
//}
    public static void main(String[] args){
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] a = {-2,-1};
        MaxSubA msa = new MaxSubA();
        System.out.println(msa.maxSubArray(a));
    }

}
