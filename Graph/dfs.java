package DSA.graph;
import java.util.ArrayList;
public class depth_first_search {
    public static void dfs(ArrayList<edge>[] graph, int curr, boolean vis[]){
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<edge> graph[] = new ArrayList[v];
        list_undirected_unweighted.createGraph(graph);
        boolean[] vis = new boolean[v];
        dfs(graph, 0, vis);
    }
}
