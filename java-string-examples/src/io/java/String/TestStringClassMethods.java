package io.java.String;

public class TestStringClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Sachin";
		System.out.println(s.toUpperCase());// SACHIN
		System.out.println(s.toLowerCase());// sachin
		System.out.println(s);// Sachin(no change in original)

		String s1 = "  Sachin  ";
		System.out.println(s1);// Sachin
		System.out.println(s1.trim());// Sachin
										// The string trim() method eliminates white spaces before and after string.

		System.out.println(s.startsWith("Sa"));// true
		System.out.println(s.endsWith("n"));// true

		System.out.println(s.charAt(0));// S
		System.out.println(s.charAt(3));// h

		System.out.println(s.length());// 6

		String s2 = new String("Sachin");
		String s3 = s2.intern();
		System.out.println(s3);// Sachin

		int a = 10;
		String s4 = String.valueOf(a);// The string valueOf() method coverts given type such as int, long, float,
										// double, boolean, char and char array into string.
		System.out.println(s4 + 10);

		String s5 = "Java is a programming language. Java is a platform. Java is fun.";
		String replaceString = s5.replace("Java", "Ruby");// replaces all occurrences of "Java" to "Kava"
		System.out.println(replaceString);
		
		
	}

}
