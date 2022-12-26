//In a preorder traversal, we need to visit the root node first, then all left child nodes, followed by the right child nodes.
// Approach #1 : take the root's left and right subtrees as a subproblem and recursively solve it.
// Approach #2 : We can also implement DFS iteratively using a stack to replicate recursive calls.

// Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
// Approach #1  Recursion : Time complexity : O(N) and space complexity : O(N)
/*class Solution {
    private List<Integer> answer = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);
        return answer;
    }
    
    public void dfs(TreeNode root){
        if(root == null) return ;
        answer.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}
*/


// Approach #2 : Iteration  Time complexity : O(N) and space complexity : O(N)


class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode currNode = stack.peek();
            stack.pop();
            if(currNode != null){
                answer.add(currNode.val);
              // operations on the stack follow the FIFO order. The node we add last is visited first.
              //Therefore, to access the left child before the right child, we add the right child before the left child.
                stack.push(currNode.right);
                stack.push(currNode.left);
            }
        }
        return answer;
    }
}
