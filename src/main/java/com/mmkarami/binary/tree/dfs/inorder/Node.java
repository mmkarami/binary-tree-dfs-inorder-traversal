package com.mmkarami.binary.tree.dfs.inorder;

/**
 * @author MohammadmehdiK
 *
 * @param <E>
 */
public class Node<E> {

	private E value;

	private Node<E> leftNode;

	private Node<E> rightNode;

	public Node(E value, Node<E> leftNode, Node<E> rightNode) {
		this.value = value;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public Node<E> getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node<E> leftNode) {
		this.leftNode = leftNode;
	}

	public Node<E> getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node<E> rightNode) {
		this.rightNode = rightNode;
	}

	@Override
	public String toString() {
		return value.toString();
	}
	
	
}