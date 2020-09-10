import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Genparen {
    public Genparen(){}
    public List<String> generateParenthesis(int n) {
        String pos = "(";
        List<String> out = new ArrayList<String>();
        List<Integer> countL = new ArrayList<Integer>();
        List<List> st = new ArrayList<List>();
        int count=0;
        out.add(pos);
        countL.add(1);
        while(count<2*n-1){
            st = dpmiddle(out,countL,n);
            out = st.get(0);
            countL = st.get(1);
            count++;
        }
        return out;
    }
    public List<List> dpmiddle(List<String> o,List<Integer> cL,int n){
        String reP;
        char end;
        int countL;
        List<List> out = new ArrayList<List>();
        List<Integer> middleL = new ArrayList<Integer>();
        List<String> middle = new ArrayList<String>();
        for(int i=0;i<o.size();i++){
            reP = o.get(i);
            countL = cL.get(i);
            end = reP.charAt(reP.length()-1);
            if(countL==n){
                reP = o.get(i);
                reP = reP+')';
                middle.add(reP);
                middleL.add(countL);
            }else{
                if(end=='('){
                    reP = o.get(i);
                    middle.add(reP + '(');
                    middleL.add(countL+1);
                    middle.add(reP+')');
                    middleL.add(countL);
                }else{
                    middle.add(reP+'(');
                    middleL.add(countL+1);
                    if(2*countL-reP.length()>0){
                        middle.add(reP+')');
                        middleL.add(countL);
                    }
                }
            }
        }
//        System.out.println(middle);
        out.add(middle);
        out.add(middleL);
        return out;
    }
    public static void main(String[] args){
//        int n =3;
        Genparen gp = new Genparen();
        System.out.println(gp.generateParenthesis(3));
    }
}
