public class RotateArray {
    public RotateArray(){}
    public int search(int[] nums, int target) {
        int r = nums.length-1,l=0,piv;
        piv = r/2;
        if(nums[piv]==target){
            return piv;
        }else if(nums[l]==target){
            return l;
        }else if(nums[r]==target){
            return r;
        }
        while(l<r-1){

            System.out.println(nums[piv]);
            if(nums[piv]<nums[piv+1]&&nums[piv]<nums[piv-1]){
                System.out.println('m');
                if(target>nums[r]){
                    r = piv-1;
                }else{
                    l = piv+1;
                }
            }else if(nums[piv]>nums[r]){
                System.out.println('l');
                if(target<nums[piv]&&target>nums[l]){
                    r = piv-1;
                }else{
                    l = piv+1;
                }
            }else{
                System.out.println('r');
                if(target>nums[piv]&&target<nums[r]){
                    l = piv+1;
                }else{
                    r = piv-1;
                }
            }
            piv = (l+r)/2;
            if(nums[piv]==target){
                return piv;
            }else if(nums[l]==target){
                return l;
            }else if(nums[r]==target){
                return r;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] a ={8,1,2,3,4,5,6,7};
        int t = 6;
        RotateArray ra = new RotateArray();
        System.out.println(ra.search(a,t));
    }
}
