import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class temperature {
    public temperature(){}


    public int[] count(int[] temp){
        if(temp==null){return temp;}
        if(temp.length==1){
            int[] out = new int[1];
            out[0]=0;
            return out;
        }
        int l=0,r=1,len=temp.length;
        int[] out = new int[len];
        while(l<len){
            while(r<len){
                if(temp[r]>temp[l]){
                    out[l]=r-l;
                    l++;
                    r=l;
                }else{
                    r++;
                }
            }

            if(l!=len-1){
                out[l]=0;
            }
            l++;
        }
        return out;
    }
//    public int[] count1(int[] temp){
//        Deque<Integer> s = new LinkedList<>();
//        int[] out = new int[temp.length];
//        int i = 0;
//        while(i<temp.length){
//            if(s.getLast()>s.getFirst()){
//                s.pollFirst();
//                out[i] = s.size();
//            }else{
//                s.addLast(temp[i]);
//            }
//        }
//        s.pollFirst();
//        out[k]=0;
//        k++;
//
//    }
    public static void main(String[] args){
        int[] in = {73,74,75,71,69,72,76,73};
        temperature t = new temperature();
//        int[] out = new int[in.length];
        t.count(in);

    }

}
