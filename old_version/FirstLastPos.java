public class FirstLastPos {
    public FirstLastPos(){}
    public int[] searchRange(int[] nums, int target) {
        int l=0,r=nums.length-1,pivl=-1,pivr=-1,piv,ind=-1;
        int[] out = {-1,-1};
        if(nums==null||r<0){
            return out;
        }
        piv = (l+r)/2;
        while(l<r){
            if(nums[piv]<target){
                if(nums[piv+1]==target){
                    piv = piv+1;
                    break;
                }
                l = piv + 1;
            }else{
                r = piv;
            }
            piv = (l+r)/2;
        }

        if(nums[piv]!=target){
            return out;
        }
        out[0]=piv;
        l = piv;
        piv = (l+r)/2;
        r = nums.length-1;
        while(l<r){
            if(nums[piv]>target){
                if(nums[piv-1]==target){
                    piv = piv-1;
                    break;
                }
                r = piv-1;
            }else{
                if(nums[piv+1]>target){
                    break;
                }
                l = piv+1;
            }

            piv = (l+r)/2;
        }
        out[1] = piv;
        return out;

    }
//    public static void main(String[] args){
//        int[] a = {}
//    }
}
