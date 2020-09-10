public class ClimbStar {
    public ClimbStar(){}
    public int climbStairs(int n) {
        return dp(n);
    }
    private int dp(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int a = dp(n-1)+dp(n-2);
        return a;
    }
    public static void main(String[] args){
        int a = 3;
        ClimbStar cs = new ClimbStar();
        System.out.println(cs.climbStairs(a));
    }
}
