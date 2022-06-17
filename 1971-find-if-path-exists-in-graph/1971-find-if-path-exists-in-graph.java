class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        Map<Integer, List<Integer>> adjList = constructGraph(edges);
        boolean[] visited = new boolean[n];
        return hasPathBFS(adjList, visited, source, destination);
        
    }
    
    public Map<Integer, List<Integer>> constructGraph (int[][] edges) {
        
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for (int[] edge : edges) {
            
            if (!adjList.containsKey(edge[0])) {
                adjList.put(edge[0], new ArrayList<>());
            }
            if (!adjList.containsKey(edge[1])) {
                adjList.put(edge[1], new ArrayList<>());
            }
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
            
        }
        return adjList;
        
    }
    
    public boolean hasPathBFS (Map<Integer, List<Integer>> adjList, boolean[] visited, int source, int destination) {
        
        if (source == destination) {
            return true;
        }
        
        Queue<Integer> q = new PriorityQueue<>();
        q.add(source);
        visited[source] = true;
        
        while (!q.isEmpty()) {
            
            int current = q.poll();
            
            for (int node : adjList.get(current)) {
                if (node == destination) {
                    return true;
                }
                if (visited[node] != true) {
                    visited[node] = true;
                    q.add(node);
                }
            }
            
        }
        
        return false;
        
    }
    
    public boolean hasPathDFS (Map<Integer, List<Integer>> adjList, boolean[] visited, int source, int destination) {
        
        visited[source] = true;
        if (source == destination) {
            return true;
        }
        
        for (int neighbour : adjList.get(source)) {
            if (visited[neighbour] != true) {
                if (hasPathDFS (adjList, visited, neighbour, destination) == true) {
                    return true;
                }
            }
        }
        
        return false;
        }
}