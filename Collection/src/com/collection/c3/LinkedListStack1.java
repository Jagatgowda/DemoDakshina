/*Implement a Stack using LinkedList as its data structure.
 * Use the Stack to implement reversing of words in a given sentence.*/
package com.collection.c3;

import java.util.EmptyStackException;

public class LinkedListStack1 implements Stack1 {
	Node head;
	Node last;
	int size;

	private class Node {
		Node next;
		char data;

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public char getData() {
			return data;
		}

		public void setData(char data) {
			this.data = data;
		}

		public Node() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Node(char data) {
			this.data = data;
			this.next = null;
		}
	}

	/*
	 * public void push(char element) { Node tempNode = new Node(element); if (head
	 * == null) { head = tempNode; } else { tempNode.next = head; head = tempNode;
	 * 
	 * } size++; }
	 * 
	 * @Override public char pop() { if (isStackEmpty()) { throw new
	 * EmptyStackException(); } else { char result = head.getData(); head =
	 * head.getNext(); size--; return result; } }
	 * 
	 * @Override public char peek() { if (isStackEmpty()) { throw new
	 * EmptyStackException(); } else { return head.getData(); } }
	 * 
	 * 
	 * 
	 * public boolean isStackEmpty() { if (size == 0) { return true;
	 * 
	 * } else return false; }
	 * 
	 * public int size() { return size; }
	 */
	public void reverse(String s) {
		String[] s1 = s.split(" ");
		String s2 ;
		for (int j = 0; j < s.length() - 1; j++) {
			s2 = s1[j];

			char[] ch = s2.toCharArray();
			{
				for (int i = s2.length() - 1; i >= 0; i--) {
					Node n1 = new Node();
					if (head == null && last == null) {
						head = last = n1;
						head.setData(ch[i]);
					} else {
						last.setNext(n1);
						last = n1;
						last.setData(ch[i]);
					}

				}
			}
		}
	}

	public void printElements() {

		Node current = head;
		while (current != null) {
			System.out.print(current.getData());
			current = current.getNext();
		}
	}
}
