package trees;

public class BalancedBST {

	public class TreeNode{
		int val;
		TreeNode right;
		TreeNode left;
		public TreeNode(int val){
			this.val = val;
		}
	}
	
	public boolean isBalanced(TreeNode node){
		if(node == null){
			return true;
		}else if(getHeight(node) == -1){
			return false;
		}
		
		return true;
	}
	
	public int getHeight(TreeNode node){
		
		if(node == null){
			return 0;
		}
		
		int left = getHeight(node.left);
		int right = getHeight(node.right);
		
		if(left == -1 || right == -1){
			return -1;
		}
		if(Math.abs(left - right) > 1){
			return -1;
		}
		
		return Math.max(left,right) +1;
		
	}
}
