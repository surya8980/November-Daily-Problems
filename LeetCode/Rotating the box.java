/*You are given an m x n matrix of characters boxGrid representing a side-view of a box. Each cell of the box is one of the following:

A stone '#'
A stationary obstacle '*'
Empty '.'
The box is rotated 90 degrees clockwise, causing some of the stones to fall due to gravity. Each stone falls down until it lands on an obstacle, another stone, or the bottom of the box. Gravity does not affect the obstacles' positions, and the inertia from the box's rotation does not affect the stones' horizontal positions.

It is guaranteed that each stone in boxGrid rests on an obstacle, another stone, or the bottom of the box.

Return an n x m matrix representing the box after the rotation described above.*/

class Solution {
    public char[][] rotated(char[][] matrix) {
        int m = matrix.length;      
        int n = matrix[0].length;   
        char[][] rotatedbox = new char[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotatedbox[j][m - 1 - i] = (char) matrix[i][j];
            }
        }
        return rotatedbox;
    }
    public char[][] rotateTheBox(char[][] box) {
    for (char[] row : box) {
        for (int i = row.length - 1; i >= 0; i--) { 
            if (row[i] == '#') {
                int j = i;
                while (j + 1 < row.length && row[j + 1] == '.') {
                    row[j + 1] = '#';
                    row[j] = '.';
                    j++;
                }
            }
        }
    }
    return rotated(box);
}

}
