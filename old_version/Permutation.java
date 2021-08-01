import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public Permutation(){}
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<Integer> l = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<List<Integer>> out = new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(nums[i]);
        }
        dp(out,l,in);
        return out;
    }
    public void dp(List<List<Integer>> out,List<Integer> l,List<Integer> in){
        if(l.size()==0){
            out.add(in);
            return;
        }
        for(int i=0;i<l.size();i++){
            List<Integer> lNew = new ArrayList<>(l);
            List<Integer> inNew = new ArrayList<>(in);
            inNew.add(l.get(i));
            lNew.remove(i);
            dp(out,lNew,inNew);
        }
    }
}
