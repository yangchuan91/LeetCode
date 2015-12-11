package com.leetcode.code.easy;

public class MaximumDepthofBinaryTree {
	
	public void testFunction(){
		/**
		 * 自行构建树
		 */
		TreeNode n1=new TreeNode(1);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(3);
		TreeNode n4=new TreeNode(4);
		TreeNode n5=new TreeNode(5);
		TreeNode n6=new TreeNode(6);
		TreeNode n7=new TreeNode(7);
		
		n1.left=n2;n1.right=n3;
		
		n2.left=n4;n2.right=n5;
		
		n4.left=n6;n4.right=n7;
		
		System.out.println(maxDepth(n1));
	}
	/**
	 * 此题用递归法来解决
	 * @param root
	 * @return
	 */
	public int maxDepth(TreeNode root) {
		if(root==null){
			return 0;
		}
		//计算左子树的最大深度
		int leftDepth=1+maxDepth(root.left);
		//计算右子树的最大深度
		int rightDepth=1+maxDepth(root.right);
		//返回左子树和右子树中的最大深度
		return leftDepth>rightDepth?leftDepth:rightDepth;
	}
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x;
		}
	}
	public static void main(String[] args) {
		new MaximumDepthofBinaryTree().testFunction();
	}

}
