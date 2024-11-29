/**You are given an integer n and a 2D integer array queries.

There are n cities numbered from 0 to n - 1. Initially, there is a unidirectional road from city i to city i + 1 for all 0 <= i < n - 1.

queries[i] = [ui, vi] represents the addition of a new unidirectional road from city ui to city vi. After each query, you need to find the length of the shortest path from city 0 to city n - 1.

Return an array answer where for each i in the range [0, queries.length - 1], answer[i] is the length of the shortest path from city 0 to city n - 1 after processing the first i + 1 queries. */

class Solution {
    private int bellmanFordHelper(List<List<Integer>> list) {
        int n = list.size();
        
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0;

         Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
 
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : list.get(u)) {
                if (distance[u] + 1 < distance[v]) {
                    distance[v] = distance[u] + 1;
                    queue.add(v);
                }
            }
        }

        return distance[n - 1];
    }
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            list.get(i).add(i + 1);
        }
        int[] res = new int[queries.length];
        int i=0;
        for (int[] query:queries) {
            list.get(query[0]).add(query[1]);
            res[i++] = bellmanFordHelper(list);
        }

        return res;
    }
}
