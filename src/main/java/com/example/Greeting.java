package com.example;

import org.apache.commons.lang3.StringUtils;

public class Greeting {
    public static int sayHi() {
        System.out.println(StringUtils.capitalize("hello, " + Greeting.getWorld(0)));
        return 0;
    }
    /* Using Java 17 syntax. */
    private static String getWorld(int value) {
        String result = switch (Math.abs(value)) {
            case 0 -> "world";        
            default -> "World";
        };
        return result;
}
}
