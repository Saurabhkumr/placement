public class Nknights {
    public static void main(String[] args) {
        int n = 4;
      boolean[][] board = new boolean[n][n];
      Knights(board,0,0, n);
    }

    static void Knights(boolean[][] board ,int row, int col , int k){
        if(k==0){
            display(board);
            System.out.println();
            return;
        }
        if(row==board.length-1 && col==board.length )return;
        if(col==board.length) {
            Knights(board, row + 1, 0, k);
            return;
        }
        if(isSafe(board,row,col)){
            board[row][col]=true;
            Knights(board,row,col+1,k-1);
            board[row][col]=false;
        }
        Knights(board,row,col+1 , k);
    }

    static boolean isSafe(boolean[][] board , int row , int col){
        if(isValid(board, row-2 , col-1)){
            if(board[row-2][col-1])return false;
            return true;
        }if(isValid(board, row-2,col+1)){
            if(board[row-2][col+1])return false;
            return true;
        }if(isValid(board,row-1,col-2)){
            if(board[row-1][col-2])return false;
            return true;
        }if(isValid(board,row-1,col+2)){
            if(board[row-1][col+2])return false;
            return true;
        }
        return true;
    }

    static boolean isValid(boolean[][] board , int row,int col){
        if(row >= 0 && row<board.length && col >= 0 && col<board.length) return true;
        return false;
    }
    static void display(boolean[][] board){
        for(boolean[] r : board){
            for(boolean element: r){
                if(element) System.out.print("K ");
                else System.out.print("X ");
            }
            System.out.println();
        }
    }



}
