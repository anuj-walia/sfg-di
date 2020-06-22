package com.digitextra.sfgdi.controllers;

import com.digitextra.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;
    /**
     * No autowired annotation required on constructor based injection
     *
     **/
    public ConstructorInjectedController(GreetingService service){
        this.greetingService=service;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
