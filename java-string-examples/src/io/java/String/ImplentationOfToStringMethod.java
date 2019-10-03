package io.java.String;

public class ImplentationOfToStringMethod {

	int id;
	String name;

	public ImplentationOfToStringMethod(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ImplentationOfToStringMethod [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplentationOfToStringMethod implentationOfToStringMethod = new ImplentationOfToStringMethod(1, "Author1");
		ImplentationOfToStringMethod implentationOfToStringMethod1 = new ImplentationOfToStringMethod(2, "Author2");
		System.out.println(implentationOfToStringMethod);
		System.out.println(implentationOfToStringMethod1);
	}

}
