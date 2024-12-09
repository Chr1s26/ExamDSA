package Problem;

public class PostOrderTraversalOfBinaryTree {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		postOrder(root);
	}
	
	
	public static TreeNode postOrder(TreeNode root) {
		if (root == null) {
			return root;
		}
		
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.value);
		return root;
	}
}

















































