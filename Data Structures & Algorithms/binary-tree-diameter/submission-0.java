/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    /*
    Intuition

    For any node in a tree, the longest path that goes through it is

    * height of left subtree + height of right subtree
    So to find the trees diameter, we check this value for every node. We also
    compare it with the best diameter found in th eleft anf right subtree


    Algorithm

    * If the tree is empty, return 0.
    * For each node 
    * Compute height of its left subtree
    * Compute height of its right subtree
    * Compute diameter through that node = leftheight+rightheight

    * Recursively find diameter of left subtree
    * Recursively find diameter of right subtree
    * The final diameter for this node is the maximum of 
    * diameter through this node
    * diameter in left subtree
    * diameter in right subtree
    * return that maximum



    */
    public int diameterOfBinaryTree(TreeNode root) {

        if(root==null){
            return 0;
        }

        int leftHeight = maxHeight(root.left);
        int rightHeight = maxHeight(root.right);
        int diameter = leftHeight+rightHeight;

        int sub = Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));

        return Math.max(diameter, sub);
        
    }
    public int maxHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxHeight(root.left),maxHeight(root.right));
    }


}
