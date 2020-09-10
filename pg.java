import java.util.ArrayList;
import java.util.List;

public class pg {
    public pg(){}
    public int sub(int[] nums){
        if(nums.length==1)return nums[0];
        int out = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            // max_count+=nums[i-1];
            out=Math.max(out,nums[i]);
            // l[i] = min;
        }
        if(out<0)return out;
        int old,init=0,end=0,old_end=0,old_init=0;
        int max_count=0;
        int min = 0;
        int[] l=new int[nums.length+1],r = new int[nums.length+1];
        l[0]=0;
        for(int i=1;i<nums.length+1;i++){
            max_count+=nums[i-1];
            min=Math.min(min,max_count);
            l[i] = min;
        }

        int max = max_count;
        r[nums.length]=max_count;
        for(int i=nums.length-1;i>0;i--){
            max_count-=nums[i];
            max = Math.max(max,max_count);
            r[i] = max;

        }

        max = Integer.MIN_VALUE;
        int[] m = new int[nums.length+1];
        for(int i=0;i<nums.length+1;i++){
            max = Math.max(max,r[i]-l[i]);
            m[i]= r[i]-l[i];
        }
        int start = -1,e = -1;
        for(int i=1;i<nums.length+1;i++){
//            System.out.println(m[i]);
            if(start!=-1&&m[i]==max){
                end=i-1;
//                System.out.println(nums[i-1]);
            }
            if(m[i]==max && start==-1){
                if(m[i]<0){
                    start = i;
                }else{
                    start = i-1;
                }
            }
        }
//        System.out.println(start);
//        System.out.println(end);
        for(int i=start;i<end;i++){
            if(nums[i]>0){
                start = i;
                break;
            }
        }
        return max;


    }
    public static void main(String[] args){
        pg PG = new pg();
        int[] a = {-1,0,1,2};
        PG.sub(a);
    }

}
