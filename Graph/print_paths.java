package DSA.graph;

import java.util.ArrayList;

public class printPaths {
    public static  void allPath(ArrayList<edge> graph[], boolean[] vis,  int curr, String path, int tar){
        if(curr==tar){
            System.out.println(path);
            return;
        }

        for(int i=0;i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                vis[curr]=true;
                allPath(graph, vis, e.dest, path+e.dest ,tar);
                vis[curr] = false;
            }
        }
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<edge> graph[] = new ArrayList[v];
        list_undirected_unweighted ls = new list_undirected_unweighted();
        ls.createGraph(graph);

        int src = 0, tar = 5;
        allPath(graph, new boolean[v], src, "0", tar);
    }
}
