package io.java.String;

public class TestStringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello" + " World";
		System.out.println(s);
		String s1 = (new StringBuilder()).append("Hello").append(" World").toString(); // Java compiler converts line
																						// number 7 to this line
																						// internally.
		System.out.println(s1);

		String s2 = 50 + 30 + "Sachin" + 40 + 40;// String concatenation operator produces a new string by appending the
													// second operand onto the end of the first operand.
		System.out.println(s2);// 80Sachin4040

		String s3 = "Sachin ";
		String s4 = "Tendulkar";
		String s5 = s3.concat(s4);
		System.out.println(s5);
	}

}
