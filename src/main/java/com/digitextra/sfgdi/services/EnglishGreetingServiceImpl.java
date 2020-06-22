package com.digitextra.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class EnglishGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
