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
/*class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        LinkedList<TreeNode> node_stack = new LinkedList();
        LinkedList<Integer> sum_stack = new LinkedList();
        if(root == null) return false;
        node_stack.add(root);
        sum_stack.add(targetSum - root.val);

        TreeNode curr_node;
        int curr_sum;

        while(!node_stack.isEmpty()){
            curr_node = node_stack.pollLast();
            curr_sum = sum_stack.pollLast();

            if(curr_node.left == null && curr_node.right == null && curr_sum == 0)
                return true;

            if(curr_node.left != null){
                node_stack.add(curr_node.left);
                sum_stack.add(curr_sum - curr_node.left.val);
            } 

            if(curr_node.right != null){
                node_stack.add(curr_node.right);
                sum_stack.add(curr_sum - curr_node.right.val);
            }
        }
        return false;
    }
}*/

class Solution {
  public boolean hasPathSum(TreeNode root, int sum) {
    if (root == null)
      return false;

    sum -= root.val;
    if ((root.left == null) && (root.right == null))
      return (sum == 0);
    return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
  }
}
