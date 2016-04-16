package mypack.tree;

import mypack.stack.*;

//siehe Folie M34 und M52
public class Tree 
{
	private TreeNode root;
	
	public Tree()
	{
		// von Hand Baum II aus Aufgabe 141 aufbauen 
		root = new TreeNode('-',null,null);
		
		root.setLeftChild(new TreeNode('+',null,null));
		root.setRightChild(new TreeNode('/',null,null));
		
		root.getLeftChild().setLeftChild(new TreeNode('a',null,null));
		// ... usw ...		
	}
	
	// siehe Folie M59
	public void inOrderRec()
	{
		inOrderRecHelp(root);
		System.out.println();
	}
	
	private void inOrderRecHelp(TreeNode current)
	{
		// TODO ...
	}
	
	// siehe Folie M60
	public void inOrderIter()
	{
		inOrderIterHelp(root);
		System.out.println();
	}
	
	private void inOrderIterHelp(TreeNode current)
	{
		// TODO ...
	}
}
