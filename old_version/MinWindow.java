import java.util.*;

public class MinWindow {
    public MinWindow(){}
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> tmap = new HashMap<>();
        for(int i=0;i<t.length();i++){
            int k = tmap.getOrDefault(t.charAt(i),0);
            tmap.put(t.charAt(i),k+1);

        }
        int begin =0,end=0,l=0,r=0,length=-1;
        HashMap<Character,Integer> smap = new HashMap<>();
        Set<Character> ls = new HashSet<>();
        while(r<s.length()){
            if(tmap.containsKey(s.charAt(r))){
                int is = smap.getOrDefault(s.charAt(r),0);
                int it = tmap.get(s.charAt(r));
                if(is+1==it){
                    ls.add(s.charAt(r));
                }
                smap.put(s.charAt(r),is+1);
            }
            while(l <= r&&ls.size()==tmap.size()){
                System.out.println(s.charAt(l));
                if(smap.containsKey(s.charAt(l))){
                    int a = smap.get(s.charAt(l));
                    if(tmap.get(s.charAt(l))==a){
                        if(length==-1||r-l+1<length){
                            begin = l;
                            end = r;
                            length=r-l+1;
                        }

                        ls.remove(s.charAt(l));
                    }
                    smap.put(s.charAt(l),a-1);
                }
                l++;
            }
            r++;
        }
        if(length==-1){
            return "";
        }
        return s.substring(begin,end+1);
    }

    public static void main(String[] args){
        String s = "ADOBECODEBANC",t = "ABC";
        MinWindow mw = new MinWindow();
        System.out.println(mw.minWindow(s,t));
    }
}
