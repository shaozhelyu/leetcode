import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombineSum {
    public CombineSum(){}
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> al = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<List<Integer>> out = new ArrayList<>();
        int ind = 0;
        for(int i =0;i<candidates.length;i++){
            al.add(candidates[i]);
        }
        Collections.sort(al);
        dp(out,in,al,target,0);
        return out;
    }
    public void dp(List<List<Integer>> out, List<Integer> in, List<Integer> al, int target,int ind){
        for(int i =ind;i<al.size();i++){
            if(target-al.get(i)>0){
                List<Integer> inNew = new ArrayList<>(in);
                inNew.add(al.get(i));
                System.out.println(target-al.get(i));
                dp(out,inNew,al,target-al.get(i),i);
            }else if(target-al.get(i)==0){
                in.add(al.get(i));
                out.add(in);
                return;
            }
        }
    }
    public static void main(String[] args){
        int[] c = {2,3,6,7};
        int target = 7;
        CombineSum cs = new CombineSum();
        System.out.println(cs.combinationSum(c,target));
    }
}
