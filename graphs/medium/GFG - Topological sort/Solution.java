// USING DFS
class Solution {
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();

        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, visited, stack, adj);
            }
        }

        ArrayList<Integer> topo = new ArrayList<>();

        while (!stack.isEmpty()) {
            topo.add(stack.pop());
        }

        return topo;
    }

    private static void dfs(int i, boolean[] visited, Stack<Integer> stack, ArrayList<ArrayList<Integer>> adj) {
        visited[i] = true;

        for (int neighbour : adj.get(i)) {
            if (!visited[neighbour]) {
                dfs(neighbour, visited, stack, adj);
            }
        }

        stack.push(i);
    }
}

// --------------------------------------------------------------------------------------------------------------

// Kahn's Algorithm - (BFS)
class Solution {
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        int[] indegree = new int[V];

        for (ArrayList<Integer> vertex : adj) {
            for (int neighbour : vertex) {
                indegree[neighbour]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            ans.add(vertex);

            for (int neighbour : adj.get(vertex)) {
                indegree[neighbour]--;

                if (indegree[neighbour] == 0) {
                    queue.add(neighbour);
                }
            }
        }

        return ans;
    }
}
