package com.digitextra.sfgdi.controllers;

import com.digitextra.sfgdi.services.EnglishGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
        ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new EnglishGreetingServiceImpl());
    }
    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
}