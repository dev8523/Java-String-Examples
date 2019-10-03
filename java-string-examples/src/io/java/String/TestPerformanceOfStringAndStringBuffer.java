package io.java.String;

public class TestPerformanceOfStringAndStringBuffer {

	public static String concatWithString() {
		String t = "Hello";
		for (int i = 0; i < 10000; i++) {
			t = t + "World";
		}
		return t;
	}

	public static String concatWithStringBuffer() {
		StringBuffer sb = new StringBuffer("Hello");
		for (int i = 0; i < 10000; i++) {
			sb.append("World");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + "ms");// String takes more time than StringBuffer
		startTime = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println("Time taken by Concating with  StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
	}

}
