//Post-order traversal is to traverse the left subtree first. Then traverse the right subtree. Finally, visit the root.

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
     private void postorderTraversal(TreeNode root, List<Integer> answer) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left, answer);   // traverse left subtree
        postorderTraversal(root.right, answer);  // traverse right subtree
        answer.add(root.val);                    // visit the root
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        postorderTraversal(root, answer);
        return answer;
    }
}



/*class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> answer = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr =root;
        while(curr != null || !stack.isEmpty()){
             if(curr != null){
                stack.push(curr);
                answer.addFirst(curr.val);
                curr = curr.right;
            }else{
                TreeNode node1 = stack.pop();
                curr = node1.left;
            } 
        }
        return answer;
    }
}*/


