import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        char[] sNew = s.toCharArray();
        List<Character> sDrop = new ArrayList<Character>();
        int ans1=0,ans2=0,ans3=0;
        int t1=0,t2=0,t3=0;
        for(int i = 0;i<s.length();i++){
            sDrop.add(sNew[i]);
        }
        int i=0,j=s.length()/2;
        if(s.length()%2==1){
            return false;
        }
    boolean a1,a2,a3;
        while(true){
        if(i>=sDrop.size()-1){
            break;
        }
//            System.out.println(i);
        a1 = sDrop.get(i) == '(' && sDrop.get(i+1)==')';
        a2 = sDrop.get(i) == '[' && sDrop.get(i+1)==']';
        a3 = sDrop.get(i) == '{' && sDrop.get(i+1)=='}';
        if(a1||a2||a3){
            sDrop.remove(i);
            sDrop.remove(i);
            i=0;
            continue;
        }
        i++;
//            if(i>sDrop.size()){
//                break;
//            }
    }
        if(sDrop.size()>0){
        return false;
    }else{
        return true;
    }
    }

//    this.mapping
    public boolean Valid(String s){
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack = new Stack<Character>();
        for(int i =0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                char top = stack.empty()?'#':stack.pop();
                if(top!=map.get(c)){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        String a = "((";
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid(a));
    }
}
