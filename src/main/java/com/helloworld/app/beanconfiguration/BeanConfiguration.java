package com.helloworld.app.beanconfiguration;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public Gson gsonBean() {
        return new Gson();
    }

}
