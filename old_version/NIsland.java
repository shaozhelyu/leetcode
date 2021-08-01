import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class NIsland {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
//        HashSet<Integer> s = new HashSet<>();
//        s.contains()
    }
    public void dfs(char[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>grid[0].length) return;
        grid[i][j]='0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
//        String a = "aaa";
//        a.eq
//        a.length()
//        List<Integer> a = new ArrayList<>();
//        a.contains()
    }

}
