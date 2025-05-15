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

 /*
    DFS(p) => list1
    DFS(q) => list2
    
    list1 == list2 ??
    
    ex1:
    list1 = [2,1,3]
    list2 = [2,1,3]

    ex2: 
    list1 = [2,1]
    list2 = [1,2]

    extra example:
        1       1
    1               1
    list1 != list2 
    // add null to distinguish them
        1               1
    1      null    null      1
    list1 = [1,1,null]
    list2 = [null,1,1] //false

 
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null || p.val != q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}