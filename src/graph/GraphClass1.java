package graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class GraphClass1 {
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    static class Edge1{
        int src;
        int weight;
        int dest;

        public Edge1(int s, int w, int d){
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    public static void createWeightedGraph(ArrayList<Edge1>[] graph){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge1>();
        }
        graph[0].add(new Edge1(0, 2, 2));
        graph[1].add(new Edge1(1, 10, 2));
        graph[1].add(new Edge1(1, 0, 3));
        graph[2].add(new Edge1(2, 2, 0));
        graph[2].add(new Edge1(2, 10,1));
        graph[2].add(new Edge1(2, -1, 3));
        graph[3].add(new Edge1(3, 0, 1));
        graph[3].add(new Edge1(3, -1, 2));
    }

    public static void bfs(ArrayList<Edge>[] graph, int v){
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[v];
        q.add(0);
        while (!q.isEmpty()){
            int curr = q.remove();
            if (!vis[curr]){
                System.out.print(curr + " ");
                vis[curr] = true;
                for (int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis){
        System.out.print(curr + " ");
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        for (int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.print(e.dest + " ");
        }

        System.out.println();
        ArrayList<Edge1>[] graph1 = new ArrayList[v];
        createWeightedGraph(graph1);
        for(int i=0; i<graph1[2].size(); i++){
            Edge1 e1 = graph1[2].get(i);
            System.out.println(e1.dest + " " + e1.weight);
        }

        System.out.println();
        bfs(graph, v);
        System.out.println();
        boolean[] vis = new boolean[v];
        dfs(graph, 0, vis);
    }
}
