/*You are given an m x n binary matrix matrix.

You can choose any number of columns in the matrix and flip every cell in that column (i.e., Change the value of the cell from 0 to 1 or vice versa).

Return the maximum number of rows that have all values equal after some number of flips*/
class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        //initialise a hashmap
        //add all the rowas by forming into a string

        HashMap<String,Integer> hm = new HashMap<>();
        for(int []row:matrix){
            StringBuilder temp = new StringBuilder();
            for(int j=0;j<matrix[0].length;j++){
                temp.append((row[j]==row[0])?'1':'0');
            }
            String pat = temp.toString();
            hm.put(pat,hm.getOrDefault(pat,0)+1);
        }
        int max=0;
        for(int count :hm.values()){
            max=Math.max(count,max);
        }
        return max;
    }
}
