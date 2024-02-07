package DSA.graph;

import java.util.ArrayList;

class edge{
    int src;
    int dest;

    public edge(int s, int d){
        this.src = s;
        this.dest = d;
    }
}
public class list_undirected_unweighted {

    public static void createGraph(ArrayList<edge> graph[]){
        for(int i=0;i<graph.length; i++){
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0,1));
        graph[0].add(new edge(0,2));

        graph[1].add(new edge(1,0));
        graph[1].add(new edge(1,3));

        graph[2].add(new edge(2,0));
        graph[2].add(new edge(2,4));

        graph[3].add(new edge(3,1));
        graph[3].add(new edge(3,4));
        graph[3].add(new edge(3,5));

        graph[4].add(new edge(4,2));
        graph[4].add(new edge(4,3));
        graph[4].add(new edge(4,5));

        graph[5].add(new edge(5,3));
        graph[5].add(new edge(5,4));
        graph[5].add(new edge(5,6));

    }
    public static void main(String[] args) {
        int v =7;
        ArrayList<edge> graph[] = new ArrayList[v];

        createGraph(graph);

        for(int i=0;i<graph[5].size();i++){
            edge e = graph[5].get(i);
            System.out.print(e.dest+ " ");
        }

    }
}
