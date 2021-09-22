package br.com.mateus.clean_architecture.endpoint;

public class Phone {
	// Value Object

	private String areaCode;
	private String number;

	public Phone(String areaCode, String number) {
		if (areaCode == null) {
			throw new IllegalArgumentException("Invalid Area Code");
		}
		if (number == null) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		this.areaCode = areaCode;
		this.number = number;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public String getNumber() {
		return number;
	}

}
