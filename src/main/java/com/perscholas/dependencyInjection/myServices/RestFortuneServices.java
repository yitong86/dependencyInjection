package com.perscholas.dependencyInjection.myServices;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneServices implements FortuneServices {

    @Override
    public String getFortune() {
        return null;
    }
}

