package com.practice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.practice.demo.evis.model"})
@EntityScan(basePackages = {"com.practice.demo.evis.domain"})
@EnableTransactionManagement
public class SideProjectBlogRefactorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SideProjectBlogRefactorApplication.class, args);
	}

}
