package com.revoltcode.springdemo.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.revoltcode.springdemo")
@EnableWebMvc
public class DemoAppConfig {
}

