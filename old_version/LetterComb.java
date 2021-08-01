import java.util.ArrayList;
import java.util.List;

public class LetterComb {
    public LetterComb(){}
    public List<String> letterCombinations(String digits) {
        char[] Dig = digits.toCharArray();
        List<char[]> dict = new ArrayList<char[]>();
        List<String> out = new ArrayList<String>();
        char[] a1 = {'a','b','c'},a2={'d','e','f'},
                a3={'g','h','i'},a4={'j','k','l'},
                a5={'m','n','o'},a6={'p','q','r','s'},
                a7 = {'t','u','v'},a8={'w','x','y','z'};
        dict.add(a1);dict.add(a2);dict.add(a3);dict.add(a4);
        dict.add(a5);dict.add(a6);dict.add(a7);dict.add(a8);
        int num;
        for(int i =0;i<Dig.length;i++){
            num = Character.getNumericValue(Dig[i]);
            if(num<2){
                continue;
            }
            out = dp(out,dict.get(num-2));
        }
        return out;
    }
    public List<String> dp(List<String> in, char[] a){
        List<String> out = new ArrayList<String>();
        if(in.size()==0){
            for(int j=0;j<a.length;j++){
                    out.add(String.valueOf(a[j]));
            }
        }
        for(int j=0;j<a.length;j++){
            for(int i=0;i<in.size();i++){
                out.add(in.get(i)+a[j]);
            }
        }
        return out;

    }
    public static void main(String[] args){
        String a = "23";
        LetterComb LC = new LetterComb();
        System.out.println(LC.letterCombinations(a));
    }

}
