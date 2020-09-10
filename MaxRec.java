import java.util.Stack;

public class MaxRec {
    public MaxRec(){}
    public int maximalRectangle(char[][] matrix) {
        int Nrow = matrix.length,Ncol = matrix[0].length;
        int[][] col = new int[Nrow][Ncol];
        int[][] row = new int[Nrow][Ncol];
        int out=0;
        for(int i=0;i<matrix.length;i++){
            int count = 0;
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j]==1){
                    count = count+1;

                }else{
                    count = 0;
                }
                col[i][j] = count;
            }
        }
        for(int j = 0;j<Ncol;j++){
            int count = 0;
            int[] a = new int[matrix.length+2];
            a[0]=0;
            a[Nrow+1]=0;
            for(int i=0;i<matrix.length;i++){
                a[i+1] = row[i][j];
            }
            Stack<Integer> s = new Stack<>();
            s.add(0);
            for(int i=1;i<a.length;i++){
                while(a[s.peek()]>a[i]){
                    int h = a[s.pop()];
                    int w = s.isEmpty()?i:i-s.peek()-1;
                    out = Math.max(out,w*h);
                }
                s.add(i);
            }
        }
        return out;
    }
}
