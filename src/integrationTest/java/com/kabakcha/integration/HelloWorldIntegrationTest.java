package com.kabakcha.integration;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kabakcha.main.HelloWorld;

public class HelloWorldIntegrationTest {

    @Test
    public void theGreetingShouldBeConvertedToLowerCase() {
        //touch the metal a.k.a. integration test
        HelloWorld hello = new HelloWorld();
        assertEquals("hello world!", hello.getGreeting().toLowerCase());
    }

}
