import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subset {
    public Subset(){}
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!l.contains(nums[i])){
                l.add(nums[i]);
            }
        }
        // Set<List<Integer>> out = new HashSet<>();
        List<List<Integer>> out = new ArrayList<>();
        List<Integer> n = new ArrayList<>();
        out.add(n);
        dp(out,n,l,0);
        // List<List<Integer>> o = new ArrayList<>(out);

        return out;
    }
    private void dp(List<List<Integer>> out,List n,List<Integer> res,int count){
        if(res.size()==0){
            return;
        }
        List<Integer> newRes = new ArrayList<>(res);
        for(int i=0;i<res.size();i++){
            List<Integer> newN = new ArrayList<>(n);
            newN.add(res.get(i));
            newRes.remove(res.get(i));
            dp(out,newN,newRes,count+1);
            out.add(newN);
        }
    }
}
