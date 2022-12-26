//In-order traversal is to traverse the left subtree first. Then visit the root. Finally, traverse the right subtree.
// for binary search tree, we can retrieve all the data in sorted order using in-order traversal

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
// Approach #1 : Recursion : Space and Time Complexity is O(N)
/*class Solution { 
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        dfs(root, answer);
        return answer;
    }
    public void dfs(TreeNode node, List<Integer> answer){
        if(node != null){
            dfs(node.left, answer);
            answer.add(node.val);
            dfs(node.right, answer);
        }
    }
}*/

// Aprroach #2 : Iteration : Space and Time Complexity is O(N)

class Solution { 
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            answer.add(curr.val);
            curr = curr.right;
        }
        
        return answer;
    }
}
