package BinaryTrees.Questions;

public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;
    TreeNode() {}
    TreeNode(int data) { this.data = data; }
    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
