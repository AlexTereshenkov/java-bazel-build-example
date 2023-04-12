package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class GreetingTest {

    @Test
    public void testGreeting() {
        assertEquals(Greeting.sayHi(), 0);   
    }
}