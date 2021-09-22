package br.com.mateus.clean_architecture.endpoint;

public class Email {
	// Value Object

	private String adress;

	public Email(String adress) {
		if (adress == null || !adress.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("Invalid Email!");
		}
		this.adress = adress;
	}

	public String getAdress() {
		return adress;
	}

}
