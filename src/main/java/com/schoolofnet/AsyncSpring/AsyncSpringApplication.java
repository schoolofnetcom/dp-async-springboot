package com.schoolofnet.AsyncSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.Future;

@SpringBootApplication
public class AsyncSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsyncSpringApplication.class, args);
	}

}
