package com.newproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "com.newproject")
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.newproject.repo.UserRepo", "com.newproject.controller.UserController", "com.newproject.service.UserService", "com.newproject.service.UserServiceImpl"})
@EnableJpaRepositories(basePackages="com.newproject.repo.UserRepo")
@EnableTransactionManagement
@EntityScan(basePackages={"com.newproject.entities.User", "com.newproject.dto.UserDTO"})
public class NewprojectApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(NewprojectApplication.class, args);
	}

}
