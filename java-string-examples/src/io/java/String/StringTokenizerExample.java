package io.java.String;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("My name is Debasish Sahoo", " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		StringTokenizer st1 = new StringTokenizer("my,name,is,khan");
		// printing next token
		System.out.println("Next token is : " + st1.nextToken(","));
	}
}
