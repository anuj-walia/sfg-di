package com.digitextra.sfgdi.controllers;

import com.digitextra.sfgdi.services.EnglishGreetingServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller=new PropertyInjectedController();
        controller.greetingService = new EnglishGreetingServiceImpl();

    }

   @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}