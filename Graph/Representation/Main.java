package Graph.Representation;

public class  Main{
    public static void main(String[] args) {

        AdjacencyMatrix graph = new AdjacencyMatrix(5);

        graph.AddEdge(0,1);
        graph.AddEdge(0,2);
        graph.AddEdge(1,0);
        graph.AddEdge(1,2);
        graph.AddEdge(1,3);
        graph.AddEdge(2,1);
        graph.AddEdge(2,2);
        graph.AddEdge(2,4);
        graph.AddEdge(3,1);
        graph.AddEdge(3,4);
        graph.AddEdge(4,2);
        graph.AddEdge(4,3);


        graph.display();

        System.out.println("BFS Traversal:");
        graph.dfs(0);

    }
}