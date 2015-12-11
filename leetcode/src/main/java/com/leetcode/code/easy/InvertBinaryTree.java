package com.leetcode.code.easy;

public class InvertBinaryTree {
	/**
	 * 递归的改变左子树和右子树的位置即可
	 * @param root
	 * @return
	 */
	public TreeNode invertTree(TreeNode root) {
		if(root==null){
			return null;
		}
		TreeNode tmp=null;
		tmp=root.left;
		root.left=root.right;
		root.right=tmp;
		invertTree(root.left);
		invertTree(root.right);
        return root;
    }
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x;
		}
	}
}
