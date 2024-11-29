/*On an 2 x 3 board, there are five tiles labeled from 1 to 5, and an empty square represented by 0. A move consists of choosing 0 and a 4-directionally adjacent number and swapping it.

The state of the board is solved if and only if the board is [[1,2,3],[4,5,0]].

Given the puzzle board board, return the least number of moves required so that the state of the board is solved. If it is impossible for the state of the board to be solved, return -1.*/
class Solution {

    // Direction map for zero's possible moves in a flattened 1D array (2x3 board)
    private final int[][] directions = {
        { 1, 3 },
        { 0, 2, 4 },
        { 1, 5 },
        { 0, 4 },
        { 3, 5, 1 },
        { 4, 2 },
    };

    public int slidingPuzzle(int[][] board) {
        // Convert the 2D board into a string representation to use as state
        StringBuilder startState = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                startState.append(board[i][j]);
            }
        }

        // Map to store the minimum moves for each visited state
        Map<String, Integer> visited = new HashMap<>();

        // Start DFS traversal from initial board state
        dfs(startState.toString(), visited, startState.indexOf("0"), 0);

        // Return the minimum moves required to reach the target state, or -1 if unreachable
        return visited.getOrDefault("123450", -1);
    }

    private void dfs(
        String state,
        Map<String, Integer> visited,
        int zeroPos,
        int moves
    ) {
        // Skip if this state has been visited with fewer or equal moves
        if (visited.containsKey(state) && visited.get(state) <= moves) {
            return;
        }
        visited.put(state, moves);

        // Try moving zero to each possible adjacent position
        for (int nextPos : directions[zeroPos]) {
            String newState = swap(state, zeroPos, nextPos); // Swap to generate new state
            dfs(newState, visited, nextPos, moves + 1); // Recursive DFS with updated state and move count
        }
    }

    // Helper method to swap characters at indices i and j in the string
    private String swap(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }
}
