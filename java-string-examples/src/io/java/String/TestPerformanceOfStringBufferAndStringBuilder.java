package io.java.String;

public class TestPerformanceOfStringBufferAndStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Hello");
		for (int i = 0; i < 10000; i++) {
			sb.append("World");
		}
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");// StringBuilder is more efficient than StringBuilder
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Hello");
		for (int i = 0; i < 10000; i++) {
			sb2.append("World");
		}
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
	}

}
