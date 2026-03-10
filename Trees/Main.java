package Trees;

public class Main {
    public static void main(String[] args) {
        BFS tree = new BFS();
        int[] arr = {4,2,7,1,3};
        tree.insertAsBt(arr);
        tree.display();
//        System.out.println(tree.levelOrderTraversal(tree.root));
//        System.out.println("level order successor is :" + tree.levelOrderSuccessor(tree.root , 14));
        System.out.println(tree.zigzagTraversal(tree.root));
    }
}
