import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
public class LongestSub {
    public LongestSub(){}
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        char oldS;
        Set<Character> strs = new HashSet<>();
        int count = 0,OldCount=1;
        for (int i = 0;i<len;i++){
            strs = new HashSet<>();
            count = 0;
            for (int j = i;j<len;j++){
                if(strs.contains(s.charAt(j))) {
                    break;
                }else{
                    count = count + 1;
//                    System.out.println(s.charAt(j));
                    strs.add(s.charAt(j));
                    OldCount = Math.max(OldCount,count);
                }
            }

        }
        return OldCount;
    }
    public int LLS(String s){
        int len = s.length(),ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0,j=0;j<len;j++){
            if (map.containsKey(s.charAt(j))){
                i = Math.max(s.charAt(j)+1,i);
            }
            ans = Math.max(ans,j-i+1);
            map.put(s.charAt(j),j);
        }
        return ans;
    }
    public static void main(String[] args){
        String s1="dvdf";
        LongestSub ls = new LongestSub();
        System.out.println(ls.lengthOfLongestSubstring(s1));
    }
}
