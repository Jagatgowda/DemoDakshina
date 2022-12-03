package com.collection.c3;

public class ArrayStack implements Stack {

	int[] arr = new int[10];
	int count;

	public void push(int element) {
		if (count < arr.length) {
			arr[count++] = element;
			//count++;
		}

	}

	public int pop() {
		if (count > 0) {
			int x = arr[count-1];
			count--;
			return x;

		}

		else {
			throw new IllegalArgumentException("Stack is empty");
		}

	}

	public int peek() {
		if (count > 0) {
			return arr[count-1];
		} else {
			throw new IllegalArgumentException("Stack is empty");
		}
	}

	public void printElements() {
		for (int i = count-1; i >=0; i--) {
			System.out.println(arr[i]);
		}
	}

}
