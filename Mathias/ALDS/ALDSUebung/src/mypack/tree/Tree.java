package mypack.tree;

import mypack.stack.*;

public class Tree {
    private TreeNode root;
    private int hright;

    public Tree() {
        root = new TreeNode('-',
                new TreeNode('+', new TreeNode('a', new TreeNode('_'), null),
                        new TreeNode('*', new TreeNode('b', null, new TreeNode('!')),
                                new TreeNode('^', new TreeNode('c'), new TreeNode('2')))),
                new TreeNode('/', new TreeNode('d'), new TreeNode('e')));
        //Strikter Baum
        /*root = new TreeNode('-',
                new TreeNode('+', new TreeNode('a', new TreeNode('_'), new TreeNode('?')),
                        new TreeNode('*', new TreeNode('b', new TreeNode('x'), new TreeNode('!')),
                                new TreeNode('^', new TreeNode('c'), new TreeNode('2')))),
                new TreeNode('/', new TreeNode('d'), new TreeNode('e')));*/
    }

    public void inOrderRec() {
        inOrderRecHelp(root);
    }

    private void inOrderRecHelp(TreeNode current) {
        if (current.getLeftChild() != null) {

            inOrderRecHelp(current.getLeftChild());
        }
        System.out.print(current.getKey());
        if (current.getRightChild() != null)
            inOrderRecHelp(current.getRightChild());
    }

    public void inOrderIter() {
        inOrderIterHelp(root);
    }

    private void inOrderIterHelp(TreeNode current) {
        StackAsArray sTreeNode = new StackAsArray();
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
                    System.out.print(((TreeNode) sTreeNode.top()).getKey());
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


    public int getHeigth() {
        //Bestimmt die Höhe des Binärbaums.
        return getHeigthHelp(root, 1);
    }

    private int h;

    private int getHeigthHelp(TreeNode current, int heigth) {
        if (current == root) h = 0;
        int hleft = heigth + 1;
        int hright = heigth + 1;
        if (current.getLeftChild() != null) getHeigthHelp(current.getLeftChild(), hleft);
        if (current.getRightChild() != null) getHeigthHelp(current.getRightChild(), hright);
        return h = heigth >= h ? heigth : h;
    }


    // geht den Baum durch und addiert jedes mal 1 wenn ein Knoten dabei ist
    public int getNumberOfNodes() {
        //Bestimmt die Anzahl der Knoten des Binärbaums.
        getNumberOfNodesHelp(root);
        return NodeCount;
    }

    private int NodeCount = 0;

    private void getNumberOfNodesHelp(TreeNode current) {
        if (current == root) NodeCount = 0;
        if (current.getLeftChild() != null) getNumberOfNodesHelp(current.getLeftChild());
        if (current.getRightChild() != null) getNumberOfNodesHelp(current.getRightChild());
        NodeCount += current.getLeftChild() == null && current.getRightChild() == null ? 0 : 1;
    }

    // geht den Baum durch und addiert jedes mal 1 wenn ein Blatt dabei ist
    public int getNumberOfLeaves() {
        //Bestimmt die Anzahl der Blätter des Binärbaums.
        getNumberOfLeavesHelp(root);
        return LeaveCount;
    }

    private int LeaveCount = 0;

    private void getNumberOfLeavesHelp(TreeNode current) {
        if (current == root) LeaveCount = 0;
        if (current.getLeftChild() != null) getNumberOfLeavesHelp(current.getLeftChild());
        if (current.getRightChild() != null) getNumberOfLeavesHelp(current.getRightChild());
        LeaveCount += current.getLeftChild() == null && current.getRightChild() == null ? 1 : 0;
    }

    public int getPathLength() {
        //Bestimmt die Pfadlänge des Binärbaums.
        getPathLengthHelp(root);
        return PathCount;
    }

    private int PathCount;

    private void getPathLengthHelp(TreeNode current) {
        if (current == root) PathCount = 0;
        if (current.getLeftChild() != null) {
            PathCount++;
            getPathLengthHelp(current.getLeftChild());
        }
        if (current.getRightChild() != null) {
            PathCount++;
            getPathLengthHelp(current.getRightChild());
        }
    }

    public boolean isStrict() {
        //Überprüft, ob der Binärbaum strikt ist.
        return isStrictHelp(root);
    }

    private boolean isStrictHelp(TreeNode current) {
        if (current.getLeftChild() != null && current.getRightChild() != null)
            return isStrictHelp(current.getLeftChild()) && isStrictHelp(current.getRightChild());
        return (current.getLeftChild() == null && current.getRightChild() == null) ? true : false;
    }


    public int getMinLeafLevel() {
        //Bestimmt die minimale Stufe im Binärbaum, auf der ein Blatt vorkommt.
        return getMinLeafLevelHelper(root, 0);


    }


    private int getMinLeafLevelHelper(TreeNode current, int heigth) {
        heigth++;
        if (current.getLeftChild() != null && current.getRightChild() != null)
            return (getMinLeafLevelHelper(current.getLeftChild(), heigth) <=
                    getMinLeafLevelHelper(current.getRightChild(), heigth) ?
                    getMinLeafLevelHelper(current.getLeftChild(), heigth) :
                    getMinLeafLevelHelper(current.getRightChild(), heigth));
        if (current.getLeftChild() != null) return getMinLeafLevelHelper(current.getLeftChild(), heigth);
        if (current.getRightChild() != null) return getMinLeafLevelHelper(current.getRightChild(), heigth);

        return heigth;

    }

    public int getMaxLeafLevel() {
        //Bestimmt die maximale Stufe im Binärbaum, auf der ein Blatt vorkommt.
        return getMaxLeafLevelHelper(root, 0);
    }

    private int getMaxLeafLevelHelper(TreeNode current, int heigth) {
        heigth++;
        if (current.getLeftChild() != null && current.getRightChild() != null)
            return (getMaxLeafLevelHelper(current.getLeftChild(), heigth) >=
                    getMaxLeafLevelHelper(current.getRightChild(), heigth) ?
                    getMaxLeafLevelHelper(current.getLeftChild(), heigth) :
                    getMaxLeafLevelHelper(current.getRightChild(), heigth));
        if (current.getLeftChild() != null) return getMaxLeafLevelHelper(current.getLeftChild(), heigth);
        if (current.getRightChild() != null) return getMaxLeafLevelHelper(current.getRightChild(), heigth);

        return heigth;

    }

    public int getNumberOfRootKeys() {
        //Bestimmt die Anzahl der Vorkommen des Schlüssels in der Wurzel im Binärbaum.
        return getNumberOfRootKeysHelp(root)-1;
    }

    private int getNumberOfRootKeysHelp(TreeNode current){
        if (current.getLeftChild() != null && current.getRightChild() != null)
            return + (root.getKey() == current.getKey()?1:0)
                    + getNumberOfRootKeysHelp(current.getLeftChild())
                    + getNumberOfRootKeysHelp(current.getRightChild());
        if (current.getLeftChild() != null) return + (root.getKey() == current.getKey()?1:0) + getNumberOfRootKeysHelp(current.getLeftChild());
        if (current.getRightChild() != null) return + (root.getKey() == current.getKey()?1:0) + getNumberOfRootKeysHelp(current.getRightChild());

        return + (root.getKey() == current.getKey()?1:0);
    }


}
