class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        // Swapping each of the 4 corners, then moving 1 box at a time and doing the same
        
        for(int i = 0; i<(n+1)/2; i++)
        {
            for(int j = 0;j<n/2;j++)
            {
                System.out.println(i + " , " + j + " with " + j + " , " + (n-i-1) + " with " + (n-i-1) + " , " + (n-j-1) + " with " + (n-j-1) + " , " + i + " with " + i + " , " + j);
                int temp = matrix[j][n-i-1];
                matrix[j][n-i-1] = matrix[i][j];
                int temp1 = matrix[n-i-1][n-j-1]; 
                matrix[n-i-1][n-j-1] = temp;
                temp = temp1;
                temp1 = matrix[n-j-1][i]; 
                matrix[n-j-1][i] = temp;
                matrix[i][j] = temp1;
            }
        }
    }
}