public class JumpGame {
    public JumpGame(){}
    public boolean canJump(int[] nums) {
        int n = nums.length,count=0,trig=1;
        if(n<=1){
            return true;
        }
        for(int i =n-2;i>-1;i--){

            if(nums[i]==0){
                trig=0;
            }
            if(trig==0){
                count++;
            }
//            System.out.println(count);
            if(nums[i]>=count){
//                System.out.println(nums[i]);
                trig = 1;
                count = 0;
            }
        }
        if(trig==1){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args){
        int[] a = {5,4,0,2,0,1,0,1,0};
        JumpGame jg = new JumpGame();
        System.out.println(jg.canJump(a));
    }
}
