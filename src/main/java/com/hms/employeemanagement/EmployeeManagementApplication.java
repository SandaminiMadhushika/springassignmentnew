package com.hms.employeemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EntityScan(basePackages = ("com.hms.employeemanagement"))
@EnableJpaRepositories(basePackages = ("com.hms.employeemanagement."))
@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

}
