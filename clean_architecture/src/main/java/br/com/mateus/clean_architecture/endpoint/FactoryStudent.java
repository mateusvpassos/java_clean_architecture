package br.com.mateus.clean_architecture.endpoint;

public class FactoryStudent {

	// Builder

	private Student student;

	public FactoryStudent withNameIdentificationEmail(String name, String identification, String email) {
		this.student = new Student(name, new Identification(identification), new Email(email));
		return this;
	}

	public FactoryStudent withPhone(String areaCode, String number) {
		this.student.addPhone(new Phone(areaCode, number));
		return this;
	}

	public Student getStudent() {
		return student;
	}
}
