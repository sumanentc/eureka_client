package com.cuddle.instruction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by suman.das on 1/5/17.
 */
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.cuddle.instruction"})
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class);

    }
}
