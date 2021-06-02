package com.testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class JenkinExampleApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinExampleApplication.class);

	@PostConstruct
	public void intt() {
		logger.info("Application started.....");
	}
	public static void main(String[] args) {
		logger.info("Application excuting....");
		SpringApplication.run(JenkinExampleApplication.class, args);
	}

}
