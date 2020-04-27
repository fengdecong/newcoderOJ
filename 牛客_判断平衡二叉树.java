public class Balance {
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root == null) return true;
        int leftHeight = getTreeHeight(root.left);
        int rightHeight = getTreeHeight(root.right);
        if(Math.abs(leftHeight - rightHeight) > 1) return false;
        return isBalance(root.left)&&isBalance(root.right);
    }
        public static int getTreeHeight(TreeNode root){
            if(root == null) return 0;
            return Math.max(getTreeHeight(root.left),getTreeHeight(root.right)) + 1;
    }
}