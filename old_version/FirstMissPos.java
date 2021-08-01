public class FirstMissPos {
    public FirstMissPos(){}
    int firstMissingPositive(int[] nums){
        int n = nums.length;
        for(int i=0;i<n;i++){
            while(nums[i]!=i+1){
                if(nums[i]<=0||nums[i]>=n||nums[i]==nums[nums[i]-1]){break;}
                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1] = temp;
            }
        }
        System.out.println(nums[3]);
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
    public static void main(String[] args){
        int[] a = {3,4,-1,1};
        FirstMissPos fmp = new FirstMissPos();
        fmp.firstMissingPositive(a);
    }
}
