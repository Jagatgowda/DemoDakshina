package com.collection.c3;

public class TestArrayStack {

	public static void main(String[] args) {
		ArrayStack myStack = new ArrayStack();
		myStack.push(5);
		myStack.push(10);
		myStack.push(15);
		myStack.printElements();

		System.out.println("peek element is =" + myStack.peek()); // -> should print 15
		System.out.println("poped element is =" + myStack.pop()); // -> should print 15
		System.out.println("peek element is =" + myStack.peek()); // -> should print 10
		myStack.printElements();// -> should print 10 5
		myStack.push(20);
		myStack.printElements();// -> should print 20 10 5

	}

}
