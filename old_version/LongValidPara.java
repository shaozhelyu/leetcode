import java.util.*;

public class LongValidPara {
    public LongValidPara(){}
//    public int longestValidParentheses(String s) {
//////        if(s==null || s.length()<=1){
//////            return 0;
//////        }
//////        Stack<Integer> st =new Stack<>();
//////        List<Integer> l = new ArrayList<>();
//////        int maxL=0,count = 1;
//////        for(int i=0;i<s.length();i++){
//////            if(s.charAt(i)==')'){
//////                if(!st.isEmpty()){
//////                    l.add(i);
//////                    l.add(st.pop());
//////                }
//////            }else{
//////                st.add(i);
//////            }
//////        }
//////        Collections.sort(l);
//////
//////        for(int i =0;i<l.size()-1;i++){
//////            if(l.get(i)+1==l.get(i+1)){
//////                count++;
//////                maxL = Math.max(maxL,count);
//////            }else{
//////                count=1;
//////            }
//////        }
//////        System.out.println(l);
//////        return maxL;
//////    }
public int longestValidParentheses(String s) {
    int left = 0, right = 0, maxlength = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(') {
            left++;
        } else {
            right++;
        }
        if (left == right) {
            maxlength = Math.max(maxlength, 2 * right);
        } else if (right >= left) {
            left = right = 0;
        }
    }

    left = right = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
        if (s.charAt(i) == '(') {
            left++;
        } else {
            right++;
        }
        if (left == right) {
            maxlength = Math.max(maxlength, 2 * left);
        } else if (left >= right) {
            left = right = 0;
        }
    }
    return maxlength;
}
    public static void main(String[] args){
        LongValidPara ls = new LongValidPara();
        String a = ")(";
        System.out.println(ls.longestValidParentheses(a));
    }

}
