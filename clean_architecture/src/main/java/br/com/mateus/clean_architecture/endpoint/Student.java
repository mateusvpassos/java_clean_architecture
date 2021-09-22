package br.com.mateus.clean_architecture.endpoint;

import java.util.ArrayList;
import java.util.List;

public class Student {
	// Entity

	private String name;
	private Identification identification;
	private Email email;
	private List<Phone> phones = new ArrayList<>();

	public Student(String name, Identification identification, Email email) {
		this.name = name;
		this.identification = identification;
		this.email = email;
	}

	public void addPhone(Phone phone) {
		this.phones.add(phone);
	}

	public String getName() {
		return name;
	}

	public Identification getIdentification() {
		return identification;
	}

	public Email getEmail() {
		return email;
	}

	public List<Phone> getPhones() {
		return phones;
	}

}
