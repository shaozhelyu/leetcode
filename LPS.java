import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;

public class LPS {
    public LPS (){}
    public String longestPalindrome(String s) {
        int len = s.length(),subLen=0,startV=0,newLen,T;
        String newS;
        char[] testS,reS;
        if(len==0){
            return s;
        }
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(s.charAt(i)==s.charAt(j)){
                    newLen = j-i+1;
                    T = 0;
                    if (subLen < newLen){
                        newS = s.substring(i,j+1);
                        System.out.println(newS);

                        for(int k=0;k<=(newS.length()-1)/2;k++){
                            if(newS.charAt(k)!=newS.charAt(newS.length()-1-k)){
                                T = 1;
                            }

                        }
                        System.out.println(T);
                        if(T==0){
                            subLen = newLen;
                            startV = i;
                        }
                    }
                }
            }

        }
        if(subLen==1){return Character.toString(s.charAt(0));}
        return s.substring(startV,startV+subLen);
    }
//    public String ExpandAroundCenter(String s){
//        if(s==null || s.length()<1) return "";
//        int start = 0,end = 0;
//        for(int i=0;i<s.length();i++){
//            int len1 = expandAroundCenter(s,i,i);
//            int len2 = expandAroundCenter(s,i,i+1);
//            int len = Math.max(len1,len2);
//            if(len>end-start){
//                start = i - (len-1)/2;
//                end = i+len/2;
//            }
//        }
//    }
//    private int expandAroundCenter(String s, int left, int right){
//        int L = left,R=right;
//        while(L>=0 && R< s.length() && s.charAt(L)==s.charAt(R)){
//            L--;
//            R++;
//        }
//        return R-L-1;
//    }
    public static void main(String[] arg){
        String s = "aaabaaaa";
        LPS l = new LPS();
        System.out.println(l.longestPalindrome(s));
    }
}
