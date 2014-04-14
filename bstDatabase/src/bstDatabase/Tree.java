package bstDatabase;

// Basic BST

public class Tree {
	public TreeNode root;
	private boolean gettingNode;
	private TreeNode temp;

	public Tree(Account a) {
		root = new TreeNode(a);
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	public void insertNode(TreeNode t, Account a) {
		if (a.getSsn() < t.getKey()) {
			if (t.getLeft() == null) {
				t.setLeft(new TreeNode(a));
			} else {
				insertNode(t.getLeft(), a); // recursive call
			}
		} else if (a.getSsn() > t.getKey()) {
			if (t.getRight() == null) {
				t.setRight(new TreeNode(a));
			} else {
				insertNode(t.getRight(), a);
			}
		}
	}
	
	public void deactivateNode(int nodeKey){
		TreeNode t= getNode(nodeKey);
		t.getAccount().setActive(false);
	}

	public boolean find(int key, TreeNode t) {
		if (t == null) {
			return false;
		} else if (key > t.getKey()) {
			return find(key, t.getRight());
		} else if (key < t.getKey()) {
			return find(key, t.getLeft());
		} else if (key == t.getKey()&&gettingNode) {
			temp=t;
			return true;
		} else if (key == t.getKey()) {
			return true;
		}
		return false;
	}

	public TreeNode min(TreeNode node) {
		if (node.getLeft() == null) {
			return node;
		}
		return min(node.getLeft());
	}

	public int minValue(TreeNode t) {
		return min(t).getKey();
	}

	public TreeNode max(TreeNode node) {
		if (node.getRight() == null) {
			return node;
		}
		return max(node.getRight());
	}

	public int maxValue(TreeNode t) {
		return max(t).getKey();
	}

	public void inOrderTraversal(TreeNode node) {

		if (node == null) {
			return;
		}

		inOrderTraversal(node.getLeft());
		// System.out.println(node.getAccount().toString());
		inOrderTraversal(node.getRight());
	}
	
	public TreeNode getNode(int nodeKey){
		gettingNode=true;
		if(find(nodeKey,root)){
			TreeNode t = temp;
			temp=null;
			gettingNode=false;
			return t;
		}
		gettingNode=false;
		return new TreeNode(new Account());
	}
}