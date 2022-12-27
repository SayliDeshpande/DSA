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

 // Recursive approach
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root != null){
            invertTree(root.left);
            invertTree(root.right);
            // swap left and right
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

        }
        return root;
    }
}

// Iterative approach :Space complexity is O(n), since in the worst case, the queue will contain all nodes in one level of the binary tree
// Time complexity : O(n) , n is number of nodes in tree, Since each node in the tree is visited / added to the queue only once, the time complexity
/*class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root != null){
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

             while(!queue.isEmpty()){
                 TreeNode curr = queue.poll();
                 // swap left and right
                 TreeNode temp = curr.left;
                  curr.left = curr.right;
                 curr.right = temp;

                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);

            }
        }
        return root;
    }
}*/


//the time complexity is O(n), where nnn is the number of nodes in the tree.
  //We cannot do better than that, since at the very least we have to visit each node to invert it.

//Because of recursion, O(h) function calls will be placed on the stack in the worst case, where hhh is the height of the tree. 
    

