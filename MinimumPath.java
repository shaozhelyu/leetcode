import java.util.Arrays;

public class MinimumPath {
    public MinimumPath(){}
    public int minPathSum(int[][] grid) {
        return 1;
    }
    private int djk(int[][] grid){
        int m = grid.length,n=grid[0].length;
        int maxM = Integer.MAX_VALUE;
        int[][] dist = new int[m][n];
        Arrays.fill(dist,maxM);
        dist[0][0]=grid[0][0];

        for(int i=1;i<m;i++){
            dist[i][0] = dist[i-1][0]+grid[i][0];
        }
        for(int j=1;j<n;j++){
            dist[0][j]=dist[0][j-1]+grid[0][j];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dist[i][j]=Math.min(dist[i][j-1],dist[i-1][j])+grid[i][j];
            }
        }
        return dist[m-1][n-1];
    }

}
