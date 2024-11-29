/*You are given two integers m and n representing a 0-indexed m x n grid. You are also given two 2D integer arrays guards and walls where guards[i] = [rowi, coli] and walls[j] = [rowj, colj] represent the positions of the ith guard and jth wall respectively.

A guard can see every cell in the four cardinal directions (north, east, south, or west) starting from their position unless obstructed by a wall or another guard. A cell is guarded if there is at least one guard that can see it.

Return the number of unoccupied cells that are not guarded.

 */
class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        char[][] arr = new char[m][n];
        int[] row = {0,1,0,-1}, col = {1,0,-1,0};
        for(char[] a:arr){
            Arrays.fill(a,'.');
        }
        for(int[] a:guards) arr[a[0]][a[1]] = 'g';
        for(int[] a:walls) arr[a[0]][a[1]] = 'w';
        for(int[] a:guards) check(arr,row,col,a[0],a[1],-1);
        int ct = 0;
        for(char[] a:arr){
            for(char ch:a){
                if(ch == '.') ct++;
            }
        }
        return ct;
    }
    public void check(char[][] arr, int[] row, int[] col, int i, int j, int x){
        if(x == -1){
            for(int y=0; y<4; y++){
                int nr = i+row[y], nc = j+col[y];
                if(nr >= 0 && nr < arr.length && nc >= 0 && nc < arr[0].length && (arr[nr][nc] == '.' || arr[nr][nc] == 'x')){
                    arr[nr][nc] = 'x';
                    check(arr,row,col,nr,nc,y);
                }
            }
        }
        else{
            int nr = i+row[x], nc = j+col[x];
            if(nr >= 0 && nr < arr.length && nc >= 0 && nc < arr[0].length && (arr[nr][nc] == '.' || arr[nr][nc] == 'x')){
                arr[nr][nc] = 'x';
                check(arr,row,col,nr,nc,x);
            }
        }
    }
}
