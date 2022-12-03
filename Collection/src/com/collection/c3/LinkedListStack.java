package com.collection.c3;

import java.util.EmptyStackException;

public class LinkedListStack {
	private Node top;
	private int size;

	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void push(int data) {
		Node tempNode = new Node(data);
		if (top == null) {
			top = tempNode;
		} else {
			tempNode.next = top;
			top = tempNode;
			size++;
		}
	}

	public int pop() {
		if (isStackEmpty()) {
			throw new EmptyStackException();
		} else {
			int result = top.data;
			top = top.next;
			size--;
			return result;
		}
	}

	public int peek() {
		if (isStackEmpty()) {
			throw new EmptyStackException();
		} else {
			return top.data;
		}
	}

	public boolean isStackEmpty() {
		if (size == 0) {
			return true;

		} else
			return false;
	}

	public int size() {
		return size;
	}

	public void display() {
		if (isStackEmpty()) {

			throw new EmptyStackException();
		} else {
			Node current = top;
			while (current != null) {
				System.out.println(current.data);
				current = current.next;
			}
		}
	}
}