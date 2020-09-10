import java.util.ArrayList;
import java.util.List;

public class TrapRainW {
    public TrapRainW(){}

    public int trap(int[] height) {
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        int sum=0,s=0,len = height.length,newS =0;
        for(int i =0;i<len;i++){
            sum = sum + height[i];
            s = Math.max(s,height[i]);
            l.add(s);
        }
        s = 0;
        for(int i = len-1;i>-1;i--){
            s = Math.max(s,height[i]);
            newS = newS + Math.min(s,l.get(i));
        }
        return newS - sum;

    }
}
