package com.pennant.propertystudio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableCaching
@EnableJpaRepositories(basePackages = {"com.pennant.propertystudio.repositories"})
public class PropertyStudioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertyStudioApplication.class, args);
	}

}
