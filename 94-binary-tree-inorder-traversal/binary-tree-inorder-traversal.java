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

 // example 1
 //     1
 //null     2
 //     3

 // list = [1, 3, 2]
class Solution {
    List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        LNR(root, result);
        return result;
    }
    //null -> 1 -> (2) -> 3 -> 2
    private void LNR(TreeNode root, List<Integer> result){
        if(root == null) return;
        LNR(root.left, result);
        result.add(root.val);
        LNR(root.right, result);
    }
}