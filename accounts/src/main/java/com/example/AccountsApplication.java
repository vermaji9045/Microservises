package com.example;

import com.example.DtoClass.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@ComponentScan("com.example")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImple")
@OpenAPIDefinition(info = @Info(title = "Accounts Microservices Rest API Documentation",
description = "Public Bank Accounts microservices Rest API Doc",
version = "v1",
contact = @Contact(name = "Sandeep",
email="sk9366026@gmail.com"),
license = @License(name="Apache 2.0")),
externalDocs = @ExternalDocumentation(

		description = "Accounts microservices Rest Api Documentation"
))
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
