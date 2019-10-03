package io.java.String;

public class StringBuilderWithAllAvailableMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java

		StringBuilder stringBuilder = new StringBuilder("Hello ");
		stringBuilder.insert(1, "Java");// now original string is changed
		System.out.println(stringBuilder);// prints HJavaello

		StringBuilder stringBuilder1 = new StringBuilder("Hello ");
		stringBuilder1.replace(1, 3, "Java");
		System.out.println(stringBuilder1);// prints HJavalo

		StringBuilder stringBuilder2 = new StringBuilder("Hello ");
		stringBuilder2.delete(1, 3);
		System.out.println(stringBuilder2);// prints Hlo

		StringBuilder stringBuilder3 = new StringBuilder("Hello");
		stringBuilder3.reverse();
		System.out.println(stringBuilder3);// prints olleH

		StringBuilder stringBuilder4 = new StringBuilder();
		System.out.println(stringBuilder4.capacity());// default 16
		stringBuilder4.append("Hello");
		System.out.println(stringBuilder4.capacity());// now 16
		stringBuilder4.append("java is my favourite language");
		System.out.println(stringBuilder4.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2

		stringBuilder4.ensureCapacity(10);// now no change
		System.out.println(stringBuilder4.capacity());// now 34
		stringBuilder4.ensureCapacity(50);// now (34*2)+2
		System.out.println(stringBuilder4.capacity());// now 70
		
	}

}
