package mypack;

import mypack.tree.Tree;

public class TreeTest 
{
	public static void main(String[] args) 
	{
		// Baum aufbauen (im Konstruktor von Tree)
		Tree derBaum = new Tree();
		
		// Baum rekuriv und iterativ in Zwischenordnung ausgeben
		derBaum.inOrderRec();
		System.out.println();
		derBaum.inOrderIter();
		System.out.println();
		System.out.println("Anzahl Blätter: " + derBaum.getNumberOfLeaves());
		System.out.println("Anzahl Knoten: " + derBaum.getNumberOfNodes());
		System.out.println("Höhe: " + derBaum.getHeigth());
		System.out.println("Pfadlänge: " + derBaum.getPathLength());
        System.out.println("Baum ist Strikt: " + derBaum.isStrict());
        System.out.println("GetMinLeaf: " + derBaum.getMinLeafLevel());
        System.out.println("GetMaxLeaf: " + derBaum.getMaxLeafLevel());
        System.out.println("GetNumRootKey: " + derBaum.getNumberOfRootKeys());
	}
}
