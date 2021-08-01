import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAna {
    public GroupAna(){}
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> out = new ArrayList<>();
        HashMap<String,Integer> rec = new HashMap<>();
        int n = strs.length;
        int k = 0;
        for(int i =0;i<n;i++){
            char[] a = strs[i].toCharArray();
            Arrays.sort(a);
            String aNew = new String(a);
            if(rec.containsKey(aNew)){
                int v = rec.get(aNew);
                List<String> inNew = out.get(v);
                inNew.add(strs[i]);
                out.set(v,inNew);
            }else{
                rec.put(aNew,k);
                List<String> inNew = new ArrayList<>();
                inNew.add(strs[i]);
                out.add(inNew);
                k++;
            }
        }
        return out;
    }
}
