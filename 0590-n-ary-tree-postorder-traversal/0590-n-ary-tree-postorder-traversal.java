class Solution {
    List<Integer> result;
    public List<Integer> postorder(Node root) {
       result = new ArrayList<Integer>();
       postorder1(root);
        return result;
        }
    public void postorder1(Node root)
    {
        if(root == null)
            return;
        for(Node i: root.children)
        postorder1(i);
        result.add(root.val);
        // postorder1(root.left);
        // postorder1(root.right);
    }
}