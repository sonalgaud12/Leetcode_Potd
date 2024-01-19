/*
Time Complexity: O(n*n)
Space Complexity: O(1)
*/
class Solution {
    public int minFallingPathSum(int[][] matrix) {
       int mat = matrix.length;
        
        int[][] t = new int[mat][mat];
        // iterating over the matrix colcumn
        for (int colcumn = 0; colcumn < mat; colcumn++) {
            t[0][colcumn] = matrix[0][colcumn];
        }
        // iterating over the matrix row
        for (int row = 1; row < mat; row++) {
            for (int colcumn = 0; col < mat; col++) {
                // getting the minimum value 
                t[row][colcumn] = matrix[row][colcumn] + Math.min(t[row - 1][colcumn], Math.min(t[row - 1][Math.max(0, colcumn - 1)], t[row - 1][Math.min(mat - 1, colcumn + 1)])
                );
            }
        }

        return Arrays.stream(t[mat - 1]).min().orElse(0);  
    }
}
