package io.java.String;

public final class ImmutableClassCreationExample {
	final String parcardNumber;

	public ImmutableClassCreationExample(String pancardNumber) {
		this.parcardNumber = pancardNumber;
	}

	public String getParcardNumber() {
		return parcardNumber;
	}

}
