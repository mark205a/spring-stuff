package com.flowetc.springstuff.registration.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @version 1.0
 * @since May 25, 2017
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.flowetc.springstuff.registration.controller", "com.flowetc.springstuff.registration.view"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
