package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    @Value("${my.name}")
    private String myName;

    public String getMyName() {
        return myName;
    }
}
