package Graph.Representation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AdjacencyMatrix {
    private int[][] matrix;

    int vertex ;

    public AdjacencyMatrix(int vertex){
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }

    public void bfs(int startVertex) {
        boolean[] visited = new boolean[vertex];

        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.offer(startVertex);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int i = 0; i < vertex; i++) {
                if (matrix[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }
    public void dfs(int startVertex) {
        boolean[] visited = new boolean[vertex];
        Stack<Integer> stack = new Stack<>();
        visited[startVertex] = true;
        stack.push(startVertex);

        while (!stack.isEmpty()) {
            int current = stack.pop();
            System.out.print(current + " ");

            for (int i = vertex-1; i >= 0; i--) {
                if (matrix[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    stack.push(i);
                }
            }
        }
    }

    public void AddEdge(int source , int destination){
        if(source > vertex && destination > vertex || source < 0 && destination < 0) {
            System.out.println("It must within the range");
            return;
        }
        matrix[source][destination] = 1;
    }

    public void display(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void removeEdge(int source ,int destination){
        if(source > vertex && destination > vertex || source < 0 && destination < 0) {
            System.out.println("It must within the range");
            return;
        }

        System.out.println("removed edge : " + matrix[source][destination]);
        matrix[source][destination] = 0;

    }
}
