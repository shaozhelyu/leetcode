import java.util.HashSet;

public class maxProduct {
    public int maxProduct(int[] nums) {
//
//        int count = 0;
//        int init = 0;
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MIN_VALUE;
//        for(int j=0;j<nums.length;j++){
//            if(nums[j]<0){
//                count++;
//            }else if(nums[j]==0){
//                max = Math.max(Product(nums,init,j-1,count),max);
//                count = 0;
//                init = j+1;
//            }
//        }
//        if(init==0){
//            return Product(nums,0,nums.length,0);
//        }else if(init>=nums.length){
//            return max;
//        }else{
//            max =Math.max(Product(nums,init,nums.length-1,count),max);
//        }
//        return max;
        int max = Integer.MIN_VALUE;
        int prod = 1;
        for(int i=0;i<nums.length;i++){
            prod = prod*nums[i];
            max = Math.max(prod,max);
            if(prod==0){
                prod = 1;
            }
        }
//        HashSet<Integer> s = new HashSet<>();
//        s.
        prod = 1;
        for(int i=nums.length-1;i>=0;i++){
            prod = prod*nums[i];
            max = Math.max(prod,max);
            if(prod==0){
                prod = 1;
            }
        }
        return max;
    }
//    public int Product(int[] nums,int init,int end,int count){
//        if(end-init<1)return Math.max(nums[init],nums[end]);
//        if(count%2==0){
//            int out = 1;
//            for(int i=init;i<end+1;i++){
//                out = out*nums[i];
//            }
//            return out;
//        }else{
//            int out1 =1,out2=1;
//            int Ncount=0;
//            for(int i=init;i<end+1;i++){
//                if(nums[i]<0){
//                    Ncount++;
//                }
//                if(Ncount>0){
//                    out2=out2*nums[i];
//                }
//                if(Ncount<count){
//                    out1=out1*nums[i];
//                }
//            }
//            return Math.max(out1,out2);
//        }
//    }
}
