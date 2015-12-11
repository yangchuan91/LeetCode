package com.leetcode.code.easy;

public class LowestCommonAncestorofaBinarySearchTree {
	/**
	 * 搜索二叉树的特性：
	 * 1、每个结点都有一个作为搜索依据的关键码(key)，所有结点的关键码互不相同。 
	 * 2、左子树（如果非空）上所有结点的关键码都小于根结点的关键码。
	 * 3、右子树（如果非空）上所有结点的关键码都大于根结点的关键码。 
	 * 4、左子树和右子树也是二叉搜索树。 
	 * 5、结点左子树上所有关键码小于结点关键码；
	 * 6、右子树上所有关键码大于结点关键码；
	 * 7、若从根结点到某个叶结点有一条路径，路径左边的结点的关键码不一定小于路径上的结点的关键码。
	 * 8、如果对一棵二叉搜索树进行中序遍历，可以按从小到大的顺序，将各结点关键码排列起来，所以也称二叉搜索树为二叉排序树。 
	 * 
	 * @param root
	 * @param p
	 * @param q
	 * @return
	 * 根据 
	 * 2、左子树（如果非空）上所有结点的关键码都小于根结点的关键码。
	 * 3、右子树（如果非空）上所有结点的关键码都大于根结点的关键码。
	 * 使用递归来解决这道题 
	 */
	public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) {
			return null;
		}
		//如果q和p都小于根节点，则表示，root节点肯定不是LCA，LCA存在于左子树上
		if (root.val > p.val && root.val > q.val) {
			return lowestCommonAncestor(root.left,p,q);
		}
		//如果q和p都大于根节点，则表示，root节点肯定不是LCA，LCA存在于右子树上
		else if(root.val > p.val && root.val > q.val) {
			return lowestCommonAncestor(root.right,p,q);
		}
		//否则root就是LCA
		else{
			return root;
		}
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		return null;
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
