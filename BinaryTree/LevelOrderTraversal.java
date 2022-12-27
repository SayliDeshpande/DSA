//Level-order traversal is to traverse the tree level by level.
/*Breadth-First Search is an algorithm to traverse or search in data structures like a tree or a graph. 
*The algorithm starts with a root node and visit the node itself first. 
*Then traverse its neighbors, traverse its second level neighbors, traverse its third level neighbors, so on and so forth.
*/
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

//Recursive Approach : TC and SC O(N)

/*class Solution {
    private List<List<Integer>> levels = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        helper(root, 0);
        return levels;
    }
    
    public void helper(TreeNode node, int level){
        // at start
        if(levels.size() == level){
            levels.add(new ArrayList<Integer>());
        }
        
        levels.get(level).add(node.val);
        if(node.left != null) helper(node.left, level + 1);
        if(node.right != null) helper(node.right, level + 1);
    }
} */

// Approach #2 : Iterative 

    class Solution { 
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> levels = new ArrayList<>();
            if (root == null) return levels; // important to avoid NullPointerException
            // Typically, we use a queue to help us to do BFS. 
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int level = 0; // at start 
            
            while( !queue.isEmpty()){
                // at start add level
                levels.add(new ArrayList<>());
                   // number of elements in the current level
                int level_length = queue.size();
                for(int i = 0 ; i < level_length ; i++){
                    TreeNode node = queue.remove();
                     // fulfill the current level
                    levels.get(level).add(node.val);
                    // add child nodes of the current level in the queue for the next level
                    if(node.left != null) queue.add(node.left);
                    if(node.right != null) queue.add(node.right);
                }
                level++; // go to next level
            }
            return levels;
        }
    }
