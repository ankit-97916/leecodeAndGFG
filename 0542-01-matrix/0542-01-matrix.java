class Solution {

    class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int[][] updateMatrix(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;
       boolean[][] visited = new boolean[rows][cols];
        Queue<Pair> q = new LinkedList<>();

        // Step 1: saare 0 ko queue mein daalo
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (mat[i][j] == 0) {
                    q.add(new Pair(i, j));
                     visited[i][j] = true;
                }
            }
        }

        // Step 2: BFS
        while (!q.isEmpty()) {

            Pair remove = q.poll();

            int row = remove.row;
            int col = remove.col;

            // up
            if (row - 1 >= 0 && !visited[row - 1][col]) {

                mat[row - 1][col] = mat[row][col] + 1;
                visited[row-1][col] = true;

                q.add(new Pair(row - 1, col));
            }

            // down
            if (row + 1 < rows && !visited[row + 1][col]) {

                mat[row + 1][col] = mat[row][col] + 1;
               visited[row+1][col] = true;
                q.add(new Pair(row + 1, col));
            }

            // left
            if (col - 1 >= 0 && !visited[row][col - 1]) {

                mat[row][col - 1] = mat[row][col] + 1;
                visited[row][col-1] = true;

                q.add(new Pair(row, col - 1));
            }

            // right
            if (col + 1 < cols && !visited[row][col + 1]) {

                mat[row][col + 1] = mat[row][col] + 1;
               visited[row][col+1] = true;

                q.add(new Pair(row, col + 1));
            }
        }

        return mat;
    }
}