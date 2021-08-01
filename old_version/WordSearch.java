import java.util.ArrayList;
import java.util.List;

public class WordSearch {
    public WordSearch(){}
    public boolean exist(char[][] board, String word) {

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){

                if(dp(board,word,i,j,0)==true){return true;}
            }
        }
        return false;

    }
    private boolean dp(char[][] board,String word,int row,int col,int ind){
        if(ind==word.length()){return true;}
        if(row>=board.length||col<0||row<0||col>=board[0].length){return false;}
        // boolean b = false;
        if(board[row][col]!=word.charAt(ind)){return false;}
        board[row][col]='*';
        boolean b = dp(board,word,row,col+1,ind+1)||dp(board,word,row,col-1,ind+1)||dp(board,word,row+1,col,ind+1)||dp(board,word,row-1,col,ind+1);
        board[row][col] = word.charAt(ind);
        return b;
    }
}
