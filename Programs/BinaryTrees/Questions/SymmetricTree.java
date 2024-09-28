package BinaryTrees.Questions;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return symmetry(root.left,root.right);
    }
    public boolean symmetry(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left== null || right == null){
            return false;
        }
        if(left.data != right.data){
            return false;
        }
        return symmetry(left.left,right.right) && symmetry(left.right,right.left);
    }
}
