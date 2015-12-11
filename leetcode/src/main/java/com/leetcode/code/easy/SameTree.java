package com.leetcode.code.easy;

public class SameTree {
	
	public void testFunction(){
		TreeNode n1=new TreeNode(1);
		TreeNode n2=new TreeNode(1);
		System.out.println(isSameTree(n1,null));
	}
	
	/**
	 * 判断两个树是否相等需要遍历两个树上面所有的节点是否相同,采用递归法来判断
	 * @param p
	 * @param q
	 * @return
	 */
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null&&q==null){
			return true;
		}
		if(p==null&&q!=null){
			return false;
		}
		if(p!=null&&q==null){
			return false;
		}
		if(p.val!=q.val){
			return false;
		}
		boolean leftFlag=isSameTree(p.left,q.left);
		boolean rightFlag=isSameTree(p.right,q.right);
		if(leftFlag&&rightFlag){
			return true;
		}
		return false;
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
		new SameTree().testFunction();
	}
}
