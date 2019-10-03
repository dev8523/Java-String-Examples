package io.java.String;

public class TestComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Saurav";
		String s5 = "SACHIN";
		String s6 = "TATA";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s5));
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s6));
		System.out.println(s6.compareTo(s4));
	}

}
