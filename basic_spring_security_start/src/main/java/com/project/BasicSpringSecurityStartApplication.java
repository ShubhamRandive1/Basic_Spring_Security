package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.project.Repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class BasicSpringSecurityStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicSpringSecurityStartApplication.class, args);
	}

}
