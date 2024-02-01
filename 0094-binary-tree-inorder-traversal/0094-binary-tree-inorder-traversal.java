
class Solution {
    List<Integer> result;
    public List<Integer> inorderTraversal(TreeNode root) {
        result = new ArrayList<Integer>();
        inorder(root);
        return result;
    }

public void inorder(TreeNode root)
 {
    if(root == null)
        return;
    inorder(root.left);
    result.add(root.val);
    inorder(root.right);
 }
}