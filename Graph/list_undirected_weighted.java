package DSA.graph;

import java.util.ArrayList;

class edge_w{
    int src;
    int dest;
    int wt;

    public edge_w(int s, int d, int w){
        this.src = s;
        this.dest = d;
        this.wt = w;
    }
}
public class list_undirected_weighted {
    public static void createGraph(ArrayList<edge_w> graph[]){
        for(int i=0;i<graph.length; i++){
            graph[i] = new ArrayList<edge_w>();
        }

        graph[0].add(new edge_w(0,2, 2));

        graph[1].add(new edge_w(1,2, 10));
        graph[1].add(new edge_w(1,3, 0));

        graph[2].add(new edge_w(2,0, 2));
        graph[2].add(new edge_w(2,1, 10));
        graph[2].add(new edge_w(2,3, -1));

        graph[3].add(new edge_w(3,1, 0));
        graph[3].add(new edge_w(3,2, 1));
    }
    public static void main(String[] args) {
        int v =4;
        ArrayList<edge_w> graph[] = new ArrayList[v];

        createGraph(graph);

        for(int i=0;i<graph[2].size();i++){
            edge_w e = graph[2].get(i);
            System.out.println(e.dest+ " " + e.wt+ " ");
        }
    }
}
