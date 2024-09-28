package BinaryTrees.Implementation;

public class Implementation {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] nodes = {3,9,-1,-1,20,15,-1,-1,7,-1,-1};
        Node root = tree.buildtree(nodes);
//        tree.preorder(root);
//        System.out.println();
//        tree.inorder(root);
//        System.out.println();
//        tree.postorder(root);
//        System.out.println();
        tree.levelorder(root);
    }
}
