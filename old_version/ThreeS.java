import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ThreeS {
    public ThreeS(){}
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> out = new ArrayList<List<Integer>>();
        if(nums==null||nums.length==0){
            return out;
        }
        Arrays.sort(nums);

        List<Integer> intl = new ArrayList<Integer>();
        int l=0,r=nums.length-1;

        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){continue;}
            if(nums[i]>0){
                break;
            }
            l=i+1;r=nums.length-1;
            // System.out.println(nums[i]);
            // System.out.println(nums[l]);
            // System.out.println(nums[r]);
            while(l<r){
                if(nums[l]==nums[l-1]&&l>i+1){
                    l++;
                    continue;

                }
                if(r<nums.length-1 && nums[r]==nums[r+1]){
                    r--;
                    continue;

                }
                if(nums[i]+nums[l]+nums[r]==0){
                    intl = new ArrayList<Integer>();
                    intl.add(nums[i]);
                    intl.add(nums[l]);
                    intl.add(nums[r]);
                    out.add(intl);
                    r--;
                    l++;
                }else if(nums[i]+nums[l]+nums[r]>0){
                    r--;
                }else{
                    l++;
                }
            }

        }
        return out;
    }
    public static void main(String[] args){
        int[] a =  {-1, 0, 1, 2, -1, -4};
        ThreeS s = new ThreeS();
        int c = s.threeSum(a).get(0).get(0);
        System.out.println(s.threeSum(a));
    }
}
