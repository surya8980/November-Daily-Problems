/*Given a square matrix[][]. The task is to rotate it by 90 degrees in clockwise direction without using any extra space.

Examples:

Input: mat[][] = [[1 2 3], [4 5 6], [7 8 9]]
Output:
7 4 1 
8 5 2
9 6 3
Input: mat[][] = [1 2], [3 4]
Output:
3 1 
4 2
Input: mat[][] = [[1]]
Output:
1
Constraints:
1 ≤ mat.size() ≤ 1000
1 <= mat[][] <= 100*/

class GFG {
    static void rotate(int matrix[][]) {
        // Code Here
        int m = matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                int k=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=k;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n/2;j++){
                int k=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=k;
            }
        }
    }
}
