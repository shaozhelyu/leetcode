public class RotateImage {
    public RotateImage(){}
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i =0;i<n/2;i++){
            for(int j = i;j<n-2*i-1;j++){
                swap(matrix,i,j);
            }
        }
    }
    public void swap(int[][] matrix,int i,int j){
        int n = matrix.length;
        int temp1 = matrix[i][j];
        int temp2 = matrix[n-j-1][i];
        int temp3 = matrix[n-i-1][n-j-1];
        int temp4 = matrix[j][n-i-1];
        matrix[i][j] = temp2;
        matrix[n-j-1][i] = temp3;
        matrix[n-i-1][n-j-1] = temp4;
        matrix[j][n-i-1] = temp1;
    }
}
