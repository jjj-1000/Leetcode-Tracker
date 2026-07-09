// Last updated: 7/9/2026, 3:12:08 PM
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
    public List<Integer> rightSideView(TreeNode root) {
       
        List<Integer> l = new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root == null) return l;
        q.add(root);
        while(q.size()>0){
                    int m=q.size();
                    for(int i=1;i<=m;i++){
                        TreeNode cur =q.poll();
                        if(i==m){
                            l.add(cur.val);     
                        }
                        if(cur.left!=null){
                            q.add(cur.left);
                        }
                        if(cur.right!=null){
                            q.add(cur.right);
                        }

                    }
        }
        return l;
    }
}