import java.util.*;
public class GraphStructure
{
    public static void main(String[]args)
    {
        Scanner S=new Scanner(System.in);
        int V=S.nextInt();
        Graph g=new Graph(V);
        for(int i=0; i<V; i++)
        {
            g.addEdge(S.nextInt(), S.nextInt());
        }
        g.printGraph();
        S.close();
    }
}
class Graph{
    int V;
    ArrayList<ArrayList<Integer>>graph;
    Graph(int V)
    {
        this.V=V;
        graph=new ArrayList<>();
        for(int i=0; i<V; i++)
        {
            graph.add(new ArrayList<Integer>());
        }
    }
    public void addEdge(int v,int u)
    {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    public void printGraph()
    {
        for(int i=0; i<graph.size(); i++)
        {
            System.out.print("The adjacency list of "+i+":");
            for(int j=0; j<graph.get(i).size(); j++)
            {
                System.out.print(graph.get(i).get(j)+" ");
            }
        }
    }
}