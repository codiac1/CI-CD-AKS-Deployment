package com.example.javaease;

import com.example.javaease.controller.HomeController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
class HomeControllerTest {
    @InjectMocks
    private HomeController homeController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testHome() {
        String content = homeController.home();
        assertNotNull(content);
        assertTrue(content.contains("Welcome to My Web Application!"));
    }

    @Test
    void testWelcome() {
        String name = "TestName";
        String content = homeController.welcome(name);
        assertNotNull(content);
        assertTrue(content.contains(", welcome to Java Ease"));
    }

    @Test
    void testGetHtmlContentSuccess() throws IOException {
        String fileName = "home.html";
        Resource resource = new ClassPathResource("static/" + fileName);
        InputStream inputStream = resource.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String expectedContent = reader.lines().collect(Collectors.joining("\n"));

        String content = homeController.getHtmlContent(fileName);
        assertNotNull(content);
        assertEquals(expectedContent, content);
    }

    @Test
    void testGetHtmlContentError() {
        String fileName = "nonexistent.html";
        String content = homeController.getHtmlContent(fileName);
        assertEquals("Error loading HTML content", content);
    }
}