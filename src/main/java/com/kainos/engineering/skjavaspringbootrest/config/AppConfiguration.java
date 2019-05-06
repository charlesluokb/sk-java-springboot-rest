package com.kainos.engineering.skjavaspringbootrest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Value("${service.greeting}")
    private String greeting;

}
