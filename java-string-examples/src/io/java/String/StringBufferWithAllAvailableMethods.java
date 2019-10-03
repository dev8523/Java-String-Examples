package io.java.String;

public class StringBufferWithAllAvailableMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer stringBuffer = new StringBuffer("Hello");
		stringBuffer.append(" World!");
		System.out.println(stringBuffer);// prints hello World!

		stringBuffer.insert(1, "Java");// now original string is changed
		System.out.println(stringBuffer);// prints HJavaello World!

		StringBuffer stringBuffer1 = new StringBuffer("Hello");
		stringBuffer1.delete(1, 3);
		System.out.println(stringBuffer1);// prints Hlo

		stringBuffer1.reverse();
		System.out.println(stringBuffer1);// prints olH

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());// default 16
		sb.append("Hello");
		System.out.println(sb.capacity());// now 16
		sb.append("java is my favourite language");
		System.out.println(sb.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2

		sb.ensureCapacity(10);// now no change
		System.out.println(sb.capacity());// now 34
		sb.ensureCapacity(50);// now (34*2)+2
		System.out.println(sb.capacity());// now 70

	}

}
