import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LargestRec {
    public LargestRec(){}
    public int largestRectangleArea(int[] heights) {
        int len=heights.length;
        int out=0;
        Stack<Integer> s = new Stack<>();
        int[] height = new int[len+2];
        for(int i=1;i<len+1;i++){
            height[i]=heights[i-1];
        }
        height[0]=0;
        height[len+1]=0;
        s.add(0);
        int i=1;
        while(i<len+1){
            while(height[s.peek()]>height[i]){

                int h = height[s.pop()];
                int w = s.isEmpty()?i:i-s.peek()-1;
                out = Math.max(out,w*h);
            }
            s.add(i++);

        }
        return out;
    }
//    public int largestRectangleArea(int[] heights) {
//        int l=0,r=heights.length-1;
//        int out=dp(heights,l,r);
//        return out;
////        largestRectangleArea()
//    }
//    private int dp(int[] heights,int l,int r){
////        if(l<0||r>heights.length-1){return 0;}
//        if(l==r){return heights[l];}
//        int mid = (l+r)/2;
//        int out = 0;
//        out = Math.max(dp(heights,l,mid),dp(heights,mid+1,r));
//
//        int ll = heights[mid];
//        r=mid;l=mid;
//        out = Math.max(out,ll);
//        while(r<heights.length){
//            if(heights[r]<heights[mid]){
//                break;
//            }
//            r++;
//        }
//        while(l>-1){
//            if(heights[l]<heights[mid]){
//                break;
//            }
//            l--;
//        }
//
//        out = Math.max(out,(r-l-1)*ll);
//        return out;
//    }
    public static void main(String[] args){
        LargestRec a = new LargestRec();
        int[] b = {2,1,5,6,2,3};
        System.out.println(a.largestRectangleArea(b));
    }
}
