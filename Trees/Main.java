package Trees;

public class Main {
    public static void main(String[] args) {
        BFS tree = new BFS();

        int[] arr = {3,9,20,15,7};
        tree.insertAsBt(arr);
        tree.display();
        System.out.println(tree.levelOrderTraversal(tree.root));
    }
}
