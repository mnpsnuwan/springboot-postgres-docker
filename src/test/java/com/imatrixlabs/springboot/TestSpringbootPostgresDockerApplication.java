package com.imatrixlabs.springboot;

import org.springframework.boot.SpringApplication;

public class TestSpringbootPostgresDockerApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringbootPostgresDockerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
