package br.com.mateus.clean_architecture.endpoint;

public class Identification {
	// Value Object
	private String identification;

	public Identification(String identification) {
		if (identification == null) {
			throw new IllegalArgumentException("Invalid Identification!");
		}
		this.identification = identification;
	}

	public String getIdentification() {
		return identification;
	}

}
