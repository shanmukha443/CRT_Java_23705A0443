public class Solving_Queens_puzzle_Using_Backtracking {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        if (solveNQueens(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }

    private static boolean solveNQueens(boolean[][] board, int row) {
        if (row == board.length) {
            return true;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true; 
                if (solveNQueens(board, row + 1)) {
                    return true; 
                }
                board[row][col] = false; 
            }
        }
        return false;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }
        
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) return false;
        }
        
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) return false;
        }
        return true;
    }

    private static void printBoard(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.print(cell ? "Q " : ". ");
            }
            System.out.println();
        }
    }
}