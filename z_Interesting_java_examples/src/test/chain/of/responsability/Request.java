package test.chain.of.responsability;

public class Request {

	private int value;
	private String description;

	public Request(int value, String description) {
		super();
		this.value = value;
		this.description = description;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
