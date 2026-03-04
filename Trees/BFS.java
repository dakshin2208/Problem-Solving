package Trees;

import java.util.*;

public class BFS {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    TreeNode root;

    public List<List<Integer>> zigzagTraversal(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                if(i % 2 == 0){
                    if(currentNode.left != null){
                        queue.offer(currentNode.left);
                    }
                    if(currentNode.right != null){
                        queue.offer(currentNode.right);
                    }
                }else{
                    if(currentNode.right != null){
                        queue.offer(currentNode.right);
                    }
                    if(currentNode.left != null){
                        queue.offer(currentNode.left);
                    }
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
    public int levelOrderSuccessor(TreeNode root , int val){
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode current = queue.poll();

            if(current.left != null){
                queue.offer(current.left);
            }
            if(current.right != null){
                queue.offer(current.right);
            }

            if(current.val == val){
                if(!queue.isEmpty()){
                    return queue.peek().val;
                }else{
                    return -1;
                }
            }
        }
        return -1;
    }

    public int height() {
        return height(root);
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public List<List<Integer>> levelOrderTraversal(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(! queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentTreeNode = queue.poll();
                currentLevel.add(currentTreeNode.val);

                if(currentTreeNode.left != null){
                    queue.offer(currentTreeNode.left);
                }


                if(currentTreeNode.right != null){
                    queue.offer(currentTreeNode.right);
                }
            }
            result.add(currentLevel);
        }

        return result;
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            double sum = 0;

            for(int i = 0 ; i < size ; i++){
                TreeNode curr = queue.poll();

                sum += curr.val;

                if(curr.left != null){
                    queue.offer(curr.left);
                }

                if(curr.right != null){
                    queue.offer(curr.right);
                }
            }

            double avg = sum / size;
            result.add(avg);
        }
        return result;
    }

    public void insertAsBst(int[] val) {
        for (int i = 0; i < val.length; i++) {
            insertAsBst(val[i], root);
        }
    }

    private TreeNode insertAsBst(int val, TreeNode root) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertAsBst(val, root.left);
        }

        if (val > root.val) {
            root.right = insertAsBst(val, root.right);
        }

        return root;
    }

    public void insertAsBt(int[] val) {
        for (int i = 0; i < val.length; i++) {
            root = insertAsBt(val[i], root);
        }
    }

    private TreeNode insertAsBt(int val, TreeNode root) {
        TreeNode newTreeNode = new TreeNode(val);

        if (root == null) {
            return newTreeNode;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();

            if (curr.left == null) {
                curr.left = newTreeNode;
                return root;
            } else {
                queue.offer(curr.left);
            }

            if (curr.right == null) {
                curr.right = newTreeNode;
                return root;
            } else {
                queue.offer(curr.right);
            }
        }

        return root;
    }
    public void display(){
        prettyPrinting(root,0);
    }

    private void prettyPrinting(TreeNode treeNode, int level) {
        if(treeNode == null){
            return;
        }
        prettyPrinting(treeNode.right,level+1);

        if(level != 0 ){
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|---->" + treeNode.val);
        }else{
            System.out.println(treeNode.val);
        }
        prettyPrinting(treeNode.left,level+1);
    }
}
