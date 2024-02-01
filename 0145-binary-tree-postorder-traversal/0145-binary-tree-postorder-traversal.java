
class Solution {
    List<Integer> result;
    public List<Integer> postorderTraversal(TreeNode root) {
        result = new ArrayList<Integer>();
        preorder(root);
        return result;
    }
    public void preorder(TreeNode root)
    {
        if(root == null)
            return;
        preorder(root.left);
        preorder(root.right);
        result.add(root.val);
    }
}