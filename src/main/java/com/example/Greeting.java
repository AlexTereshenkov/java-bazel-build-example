package com.example;

import org.apache.commons.lang3.StringUtils;

public class Greeting {
    public static int sayHi() {
        System.out.println(StringUtils.capitalize("hello, world!"));
        return 0;
    }
}
