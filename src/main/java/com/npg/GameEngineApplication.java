package com.npg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GameEngineApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(GameEngineApplication.class, args);

	}
}
