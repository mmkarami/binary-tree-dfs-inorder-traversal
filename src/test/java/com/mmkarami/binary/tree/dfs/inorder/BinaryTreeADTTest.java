package com.mmkarami.binary.tree.dfs.inorder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryTreeADTTest {

	private BinaryTreeADT<String> tree;

	@BeforeEach
	public void initBinaryTree() {
		Node<String> n9 = new Node<String>("N9", null, null);
		Node<String> n8 = new Node<String>("N8", null, null);
		Node<String> n4 = new Node<String>("N4", n8, n9);

		Node<String> n5 = new Node<String>("N5", null, null);
		Node<String> n2 = new Node<String>("N2", n4, n5);

		Node<String> n6 = new Node<String>("N6", null, null);
		Node<String> n7 = new Node<String>("N7", null, null);
		Node<String> n3 = new Node<String>("N3", n6, n7);

		Node<String> n1 = new Node<String>("N1", n2, n3);

		tree = new BinaryTreeADT<>(n1);
	}

	@Test
	public void testCreateTreeWithoutNode_whenCreateTreeWithoutNode_thenItMustBeCreatedTreeWithoutNode() {

		// Arrange
		BinaryTreeADT<String> tree;

		// Act
		tree = new BinaryTreeADT<>();

		// Assert
		assertEquals(0, tree.size());
	}

	@Test
	public void testPreOrderTraverse_whenTraverseTreePreOrder_thenItMustReturnStringOfNodesInPreOrderSequence() {

		// Arrange
		BinaryTreeADT<String> tree = this.tree;

		// Act
		String result = tree.traverse();

		// Assert
		System.out.println(result);
		assertEquals("N8 N4 N9 N2 N5 N1 N6 N3 N7 ", result);
	}

}