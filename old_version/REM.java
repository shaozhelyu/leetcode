public class REM {
    public REM(){}
    public boolean isMatch(String s, String p){
        boolean[][] map = new boolean[s.length()+1][p.length()+1];
        map[0][0]=true;

        char[] sNew = s.toCharArray(),pNew=p.toCharArray();
        for(int i=1;i<p.length()+1;i++){
            if (pNew[i-1]=='*'){
                map[0][i]=map[0][i-2];
            }
        }
        for(int i =1; i<s.length()+1;i++){
            for(int j=1;j<p.length()+1;j++){
                if(pNew[j-1]=='.' || pNew[j-1]==sNew[i-1]){
                    map[i][j]=map[i-1][j-1];
                }else if(pNew[j-1]=='*'){
                    map[i][j]=map[i][j-2];
                    if (pNew[j-2]=='.' || pNew[j-2]==sNew[i-1]){
                        map[i][j]=map[i][j]|map[i-1][j];
                    }
                }else{
                    map[i][j]=false;
                }
            }
        }
        return map[s.length()][p.length()];
    }

    public static void main(String[] args){
        String s = "ab";
        String p= ".*";
        REM r = new REM();
        System.out.println(r.isMatch(s,p));
    }
}
