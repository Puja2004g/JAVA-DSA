package DSA.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class breadth_first_search {

    public  static void bfs(ArrayList<edge>[] graph, int v){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[v];
        q.add(0);

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
        list_undirected_unweighted.createGraph(graph);
        bfs(graph, v);
    }
}
