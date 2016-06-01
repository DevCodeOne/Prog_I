package mypack.tree;

import mypack.stack.*;

public class Tree {
	private TreeNode root;

	public Tree() {
		root = new TreeNode('-',
				new TreeNode('+', new TreeNode('a', new TreeNode('_'), null),
						new TreeNode('*', new TreeNode('b', null, new TreeNode('!')),
								new TreeNode('^', new TreeNode('c'), new TreeNode('2')))),
				new TreeNode('/', new TreeNode('d'), new TreeNode('e')));
	}

	public void inOrderRec() {
		inOrderRecHelp(root);
	}

	private void inOrderRecHelp(TreeNode current) {
		if (current.getLeftChild() != null) {

			inOrderRecHelp(current.getLeftChild());
		}
		System.out.println(current.getKey());
		if (current.getRightChild() != null)
			inOrderRecHelp(current.getRightChild());
	}

	public void inOrderIter() {
		inOrderIterHelp(root);
	}

	private void inOrderIterHelp(TreeNode current) {
		Stack sTreeNode = new Stack();
		boolean ende = false;

		do {
			while (current != null) {
				try {
					sTreeNode.push(current);
				} catch (StackOverflow e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				current = current.getLeftChild();
			}
			if (sTreeNode.empty())
				ende = true;
			else {
				try {
					System.out.println(((TreeNode) sTreeNode.top()).getKey());
					current = ((TreeNode) sTreeNode.top()).getRightChild();
					sTreeNode.pop();
				} catch (StackUnderflow e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} while (!ende);
	}

	public TreeNode init() {
		root = new TreeNode();
		return root;
	}

	public TreeNode getRoot() {
		return root;
	}

}
