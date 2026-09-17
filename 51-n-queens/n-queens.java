class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        boolean[][] arr = new boolean[n][n];

        queenSit(arr, n, 0, ans);

        return ans; 
    }

    public void queenSit(boolean[][] arr, int tq, int row,
                         List<List<String>> ans) {

        if (tq == 0) {

            List<String> board = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {

                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < arr[0].length; j++) {

                    if (arr[i][j]) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }

                board.add(sb.toString());
            }

            ans.add(board);

            return;
        }

        for (int col = 0; col < arr[0].length; col++) {

            if (isSafe(arr, row, col)) {

                arr[row][col] = true;

                queenSit(arr, tq - 1, row + 1, ans);

                // Backtracking
                arr[row][col] = false;
            }
        }
    }

    public boolean isSafe(boolean[][] arr, int row, int col) {

        int r = row;

        // Up direction
        while (r >= 0) {

            if (arr[r][col]) {
                return false;
            }

            r--;
        }

        // Left diagonal
        r = row;
        int c = col;

        while (r >= 0 && c >= 0) {

            if (arr[r][c]) {
                return false;
            }

            r--;
            c--;
        }

        // Right diagonal
        r = row;
        c = col;

        while (r >= 0 && c < arr[0].length) {

            if (arr[r][c]) {
                return false;
            }

            r--;
            c++;
        }

        return true;
    }
}