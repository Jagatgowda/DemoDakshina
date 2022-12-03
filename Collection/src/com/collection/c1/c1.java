package com.collection.c1;

public class c1 {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = new String("Java");
		System.out.println("s1.equals(s2)=" + s1.equals(s2));
		System.out.println("(s1==s2)=" + s1 == s2);
		String s3=new String("Python");
		String s4="Python";
		String s5="Python";
		System.out.println("s3.equals(s4)=" + s3.equals(s4));
		System.out.println("(s3==s4)=" + (s3 == s4));
		System.out.println("(s5==s4)=" + (s5 == s4));
	}
}