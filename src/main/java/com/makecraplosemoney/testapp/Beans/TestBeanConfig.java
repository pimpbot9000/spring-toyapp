package com.makecraplosemoney.testapp.Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestBeanConfig {

    @Bean
    public MyBean createBean() {
        return new MyBean("hello, sir!");
    }
}
