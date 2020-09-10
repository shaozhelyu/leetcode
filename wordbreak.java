//import ja

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class wordbreak {
    public wordbreak(){}
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s.length()==0)return true;
        HashMap<String,Integer> l = new HashMap<>();
        for(int i=0;i<wordDict.size();i++){
            l.put(wordDict.get(i),0);
        }
//        l.containsValue()
        return wb(s,0,wordDict,l);
    }
    public boolean wb(String s,int begin,List<String> wordDict,HashMap<String,Integer> l){
        if(begin==s.length()-1 && !l.containsValue(0))return true;
        boolean out = false;
        for(int i=0;i<wordDict.size();i++){
            String a = wordDict.get(i);
            int len = a.length();
            if(len-1+begin>=s.length()){
                continue;
            }
            if(s.substring(begin,len-1+begin)==a){
                HashMap<String,Integer> newl = new HashMap<>(l);
                newl.replace(a,l.get(a)+1);
                out = out|wb(s,len-1+begin,wordDict,newl);
            }
        }
        return out;
    }

}
