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
    String max="{}";
    public String smallestFromLeaf(TreeNode root) {
        check(root,new StringBuilder());
        return max;
    }
    void check(TreeNode a,StringBuilder sb){
        if(a.right==null && a.left==null){
            sb.append((char)(97+a.val));
            sb.reverse();
            if(max.compareTo(sb.toString())>0) max=sb.toString();
            sb.reverse();
            sb.deleteCharAt(sb.length()-1);
            return ;
        }
        sb.append((char)(97+a.val));
       if(a.left!=null) check(a.left,sb);
       if(a.right!=null) check(a.right,sb);
        sb.deleteCharAt(sb.length()-1);
    }
}