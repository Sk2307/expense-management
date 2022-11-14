package com.example.expense;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ExpenseManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseManagementSystemApplication.class, args);
	}

}
