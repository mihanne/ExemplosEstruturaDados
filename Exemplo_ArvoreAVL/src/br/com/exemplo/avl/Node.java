package br.com.exemplo.avl;

/**
 * Node for an AVL tree that holds an integer, data, and pointers to 
 * its left and right children, leftChild and rightChild, respectively. 
 * @author Isaac Mast
 */
public class Node {

	//Declare instance variables
	private int data;
	private int balanceFactor;
	private Node leftChild;
	private Node rightChild;

	public Node() {
		this.data = 0;
		this.balanceFactor = 0;
		this.leftChild = null;
		this.rightChild = null;
	}

	/**
	 * Constructs a leaf node that stores an integer, data
	 * @param data the integer to set the data value to for the new node
	 */
	public Node(int data) {
		this.data = data;
		this.balanceFactor = 0;
		this.leftChild = null;
		this.rightChild = null;
	}

	/**
	 * Sets the data value of the current node
	 * @param data - the new data value that the node contains
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * Gets the data value of the current node
	 * @return the data value of the current node
	 */
	public int getData() {
		return this.data;
	}

	/**
	 * Sets the data value of the left child of the current node
	 * @param data the integer to set the data value to for the left 
	 * child of the current node 
	 */
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild; 
	}

	/**
	 * Returns the left child node of the current node
	 * @return leftChild the left child of the current node
	 */
	public Node getLeftChild() {
		return this.leftChild;
	}

	/**
	 * Sets the data value of the right child of the current node
	 * @param data the integer to set the data value to for the right 
	 * child of the current node
	 */
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

	/**
	 * Returns the right child node of the current node
	 * @return rightChild the right child of the current node
	 */
	public Node getRightChild() {
		return this.rightChild;
	}

	/**
	 * Determines the balance factor of the current node  
	 * The balance factor is equal to the difference between the  
	 * height of the left subtree and the right subtree of the current node.
	 * @param node - the node to determine the balance factor of
	 * @param height - the height of the node's subtrees 
	 * @return balanceFactor the balance factor of the current node
	 */
	public int getBalanceFactor(Node node, int height) {
		if (node == null) {
			return height;
		} else {
			height++;
			return getBalanceFactor(node.getLeftChild(), height) - getBalanceFactor(node.getRightChild(), height);
		}
	}
}
