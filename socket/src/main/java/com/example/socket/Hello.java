package com.example.socket;

public class Hello {
    private String greeting;

    public Hello() {
    }

    public Hello(String greeting) {
        this.greeting = greeting;
    }

    public Hello setGreeting(String greeting) {
        this.greeting = greeting;
        return this;
    }

    public String getGreeting() {
        return this.greeting;
    }
}
