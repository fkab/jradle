package com.example.integration;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.main.HelloWorld;

public class HelloWorldIntegrationTest {

    @Test
    public void theGreetingShouldBeConvertedToLowerCase() {
        HelloWorld hello = new HelloWorld();
        assertEquals("hello world!", hello.getGreeting().toLowerCase());
    }

}
