package bstDatabase;

// Basic Binary Search Tree Node

public class TreeNode {
	private int key;
	private Account account;
	private TreeNode left;
	private TreeNode right;

	public TreeNode(Account a) {
		key = a.getSsn();
		account = a;
		left = right = null;
	}

	public TreeNode(Account a, TreeNode leftNode, TreeNode rightNode) {
		key = a.getSsn();
		account = a;
		left = leftNode;
		right = rightNode;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int n) {
		key = n;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode leftNode) {
		left = leftNode;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode rightNode) {
		right = rightNode;
	}

}