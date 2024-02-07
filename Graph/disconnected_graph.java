package DSA.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class disconnected_graph {
    public static void disconnected_createGraph(ArrayList<edge> graph[]){
        for(int i=0;i<graph.length; i++){
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0,1));
        graph[0].add(new edge(0,2));

        graph[1].add(new edge(1,3));

        graph[4].add(new edge(4,5));
        graph[4].add(new edge(4,6));

    }
    public  static void disconnected_bfs(ArrayList<edge>[] graph, int v, boolean[] vis, int start){
        //O(V+E)
        Queue<Integer> q = new LinkedList<>();

        q.add(start);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr] = true;

                for(int i=0;i<graph[curr].size();i++){
                    edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<edge> graph[] = new ArrayList[v];
        disconnected_createGraph(graph);
        boolean vis[] = new boolean[v];
        for(int i=0;i<v;i++){
            disconnected_bfs(graph, v, vis ,i );
        }
    }
}
