import java.util.ArrayList;
import java.util.List;

public class UnPath {
    public UnPath(){}
    public int uniquePaths(int m, int n) {
        int[][] matri = new int[m][n];
        for(int i =0;i<n;i++){
            matri[0][i]=1;
        }
        for(int i =0;i<m;i++){
            matri[i][0]=1;
        }
        for(int i =1;i<n;i++){
            for(int j = 1;j<m;j++){
                matri[j][i]=matri[j-1][i]+matri[j][i-1];
            }
        }

//        p.
//        System.out.println(matri.length);
        return matri[matri.length-1][matri[0].length-1];
    }

    public static void main(String[] args){
        int m = 7;
        int n = 3;
        UnPath up = new UnPath();
        System.out.println(up.uniquePaths(m,n));
    }
}
