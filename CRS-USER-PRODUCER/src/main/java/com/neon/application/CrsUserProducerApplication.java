package com.neon.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableJpaRepositories("com.neon.repository")
@EntityScan("com.neon.model")
@EnableWebMvc
@EnableAutoConfiguration
@ComponentScan("com.neon.*")
@EnableDiscoveryClient
@SpringBootApplication
public class CrsUserProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrsUserProducerApplication.class, args);
	}

}
