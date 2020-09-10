public class coin {
    public coin(){}
    public void count(int[] coins,int amount){

    }
    public int dp(int[] coins,int amount){
        int minC = -1;
        for(int i:coins){
            int remain = amount -i;
            if(remain<0){
                continue;
            }else if(remain==0){
                return 1;
            }else{
                if(dp(coins,remain)==-1){
                    continue;
                }
                if(minC==-1){
                    minC = dp(coins,remain)+1;
                }else{
                    minC = Math.min(minC,dp(coins,remain)+1);
                }
            }
        }
        return minC;
    }
}
