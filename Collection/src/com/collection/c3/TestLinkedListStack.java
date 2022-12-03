package com.collection.c3;

public class TestLinkedListStack {
public static void main(String[] args) {
	LinkedListStack stack=new LinkedListStack();
	System.out.println("is empty="+stack.isStackEmpty());
	stack.push(10);
	stack.push(20);
	stack.push(30);
	stack.push(40);
	stack.push(50);
	stack.push(60);
	System.out.println("size="+stack.size());
	System.out.println("is empty="+stack.isStackEmpty());
	System.out.println("peek="+stack.peek());
	System.out.println("poped element="+stack.pop());
	System.out.println("peek="+stack.peek());
	System.out.println("size="+stack.size());
	stack.display();
}
}
