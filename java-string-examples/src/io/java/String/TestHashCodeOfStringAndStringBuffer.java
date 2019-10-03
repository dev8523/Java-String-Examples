package io.java.String;

public class TestHashCodeOfStringAndStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hashcode test of String:");
		String str = "java";
		System.out.println(str.hashCode());// 3254818
		str = str + "tpoint";
		System.out.println(str.hashCode());// 229541438

		System.out.println("Hashcode test of StringBuffer:");
		StringBuffer sb = new StringBuffer("java");
		System.out.println(sb.hashCode());// 366712642
		sb.append("tpoint");
		System.out.println(sb.hashCode());// 366712642
	}

}
