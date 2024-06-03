package com.example.javaEase.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

@RestController
public class HomeController {
	@GetMapping("/")
	public String home() {
		return getHtmlContent("home.html");
	}

	@GetMapping("/welcome/{name}")
	public String welcome(@PathVariable String name) {
		return getHtmlContent("welcome.html")
				.replace("{name}", name);
	}

	private String getHtmlContent(String fileName) {
		Resource resource = new ClassPathResource("static/" + fileName);
		try (InputStream inputStream = resource.getInputStream()) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			return reader.lines().collect(Collectors.joining("\n"));
		} catch (IOException e) {
			e.printStackTrace();
			return "Error loading HTML content";
		}
	}
}
