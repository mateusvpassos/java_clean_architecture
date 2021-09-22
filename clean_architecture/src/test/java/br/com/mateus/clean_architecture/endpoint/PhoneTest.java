package br.com.mateus.clean_architecture.endpoint;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class PhoneTest {

	@Test
	void invalidAreaCode() {
		assertThrows(IllegalArgumentException.class, () -> new Phone(null, "9999"));
	}

	@Test
	void invalidPhoneNumber() {
		assertThrows(IllegalArgumentException.class, () -> new Phone("99", null));
	}

}
