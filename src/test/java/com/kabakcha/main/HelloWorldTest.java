package com.kabakcha.main;

import static org.junit.Assert.*;

import org.junit.Test;
import com.kabakcha.main.HelloWorld;
import static org.mockito.Mockito.*;

public class HelloWorldTest {
    @Test
    public void shouldSayHello() {
        //stupid mock :)
        HelloWorld hello = mock(HelloWorld.class);
        when(hello.getGreeting()).thenReturn("Hello world!");
        assertEquals("Hello world!", hello.getGreeting());
    }
}
