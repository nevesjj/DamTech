package com.Projeto.DamTech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class DamTechApplication {

	public static void main(String[] args) {
		SpringApplication.run(DamTechApplication.class, args);
	}

}
