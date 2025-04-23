package com.example.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ConfigclientApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigclientApplication.class)
				.web(WebApplicationType.SERVLET)  // or .REACTIVE if using webflux
				.run(args);
	}
}


