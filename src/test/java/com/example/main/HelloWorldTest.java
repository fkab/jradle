package com.example.main;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.main.HelloWorld;

public class HelloWorldTest {
    @Test
    public void shouldSayHello() {
        HelloWorld hello = new HelloWorld();
        assertEquals("Hello World!", hello.getGreeting());
    }
}
