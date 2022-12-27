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
 // Approach #1 : REcursive TC : O(N) and SP : O(H) H is height of the tree
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }

        return (left.val == right.val 
                && isMirror(left.left, right.right)
                && isMirror(left.right, right.left));
    }
}


// Approach #2 : Iteration
/*class Solution {
    public boolean isSymmetric(TreeNode root) {
       Queue<TreeNode> queue = new LinkedList<>();
       queue.add(root);
        queue.add(root);
       while(!queue.isEmpty()){
           TreeNode node1 = queue.poll();
           TreeNode node2 = queue.poll();
           if(node1 == null && node2 == null) continue;
           if(node1 == null || node2 == null) return false;

           if(node1.val != node2.val) return false;

           queue.add(node1.left);
           queue.add(node2.right);
           queue.add(node1.right);
           queue.add(node2.left);
       }
       return true;
    }
}*/
