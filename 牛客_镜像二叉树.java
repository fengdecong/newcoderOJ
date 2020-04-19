//递归求镜像二叉树
public void Mirror(TreeNode root){
	if(root == null){
		return;
	}
	TreeNode node = root.left;
	root.left = root.right;
	root.right = node;
	while(root.left != null){
		Mirror(root.left);
	}while(root.right != null){
		Mirror(root.right);
	} 
}