package br.com.mateus.clean_architecture.endpoint;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IdentificationTest {

	@Test
	void invalidIdentification() {
		assertThrows(IllegalArgumentException.class, () -> new Identification(null));
	}

}
