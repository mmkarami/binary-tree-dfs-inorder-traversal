package com.mmkarami.binary.tree.dfs.inorder;

public class BinaryTreeADT<E> {

	private Node<E> root;

	public BinaryTreeADT(Node<E> root) {
		this.root = root;
	}
	
	public BinaryTreeADT() {
		this.root = null;
	}

	public Node<E> getRoot() {
		return root;
	}

	public void setRoot(Node<E> root) {
		this.root = root;
	}
	
	public void print() {
		printNodeValuesByDfsInOrder(root);
	}

	public int size() {
		return sizeTreeByDfsInOrder(root);
	}
	
	public String traverse() {
		return traverseNodeValuesByDfsInOrder(root);
	}
	
	private int sizeTreeByDfsInOrder(Node<E> node) {
		if (node == null)
			return 0;
		int sum = 0;
		sum += sizeTreeByDfsInOrder(node.getLeftNode());
		sum++;
		sum += sizeTreeByDfsInOrder(node.getRightNode());
		return sum;
	}
	
	private void printNodeValuesByDfsInOrder(Node<E> node) {
		if (node == null)
			return;
		printNodeValuesByDfsInOrder(node.getLeftNode());
		System.out.print(node.toString());
		printNodeValuesByDfsInOrder(node.getRightNode());
	}
	
	private String traverseNodeValuesByDfsInOrder(Node<E> node) {
		if (node == null)
			return "";
		String result = "";
		result += traverseNodeValuesByDfsInOrder(node.getLeftNode());
		result += node.toString() + " ";
		result += traverseNodeValuesByDfsInOrder(node.getRightNode());
		return result;
	}
}