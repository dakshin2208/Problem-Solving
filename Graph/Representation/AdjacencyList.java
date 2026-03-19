package Graph.Representation;

import java.util.*;

public class AdjacencyList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    int v;
    Node adj[];

    AdjacencyList(int v) {
        this.v = v;
        adj = new Node[v];
    }

    void list(int src, int dest) {
        Node newNode = new Node(dest);
        newNode.next = adj[src];
        adj[src] = newNode;

        Node newnode = new Node(src);
        newnode.next = adj[dest];
        adj[dest] = newnode;

    }

    void display() {
        for (int i = 0; i < v; i++) {
            Node temp = adj[i];
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner a = new Scanner(System.in)) {
            int v = a.nextInt();
            AdjacencyList cse = new AdjacencyList(v);
            int m = a.nextInt();
            int i;
            for (i = 0; i < m; i++) {
                int src = a.nextInt();
                int dest = a.nextInt();
                cse.list(src, dest);
            }
            cse.display();
        }
    }

}