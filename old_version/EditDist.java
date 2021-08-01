public class EditDist {
    public EditDist(){}
    public int minDistance(String word1, String word2) {
        int m = word1.length(),n=word2.length();
        int[][] map = new int[n+1][m+1];
        if(n==0){
            return m;
        }
        if(m==0){return n;}
        char c = word2.charAt(0);
        map[0][0]=word1.charAt(0)==word2.charAt(0)?0:1;
        // System.out.println(map[0][0]);
        for(int i=0;i<m;i++){
            map[0][i]=i;
        }
        for(int i=1;i<n;i++){
            map[i][0]=i;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                int a = Math.min(map[i-1][j-1],Math.min(map[i-1][j],map[i][j-1]));
                if(word1.charAt(j)==word2.charAt(i)){
                    map[i][j] = map[i-1][j-1];
                }else{
                    map[i][j]=a+1;
                }
            }
        }
        return map[n][m];
    }
}
