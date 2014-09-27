package com.kabakcha.main;

import java.io.IOException;
import java.util.Properties;

public class HelloWorld {
    
    public String getGreeting() {
        return readProperty("com.kabakcha.greeting");
    }

    private String readProperty(final String property) {
        Properties prop = new Properties();
        // load a properties file from class path, inside static method
        try {
            prop.load(HelloWorld.class.getClassLoader().getResourceAsStream(
                    "jradle.properties"));
        } catch (IOException e) {
            System.err.println("Could not load jradle.properties!");
        }

       // exception handling 
       String text = prop.getProperty(property);
       
       if (text != null) {
           return text;
       } else {
           throw new IllegalArgumentException(property + " doesn't exist!");
       }
    }
}
