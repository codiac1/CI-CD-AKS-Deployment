package com.example.javaease;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class JavaWebAppTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testMainMethod() {
		assertDoesNotThrow(() -> JavaWebApp.main(new String[]{}));
	}

}
