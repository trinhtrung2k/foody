package com.trinhtrung.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.trinhtrung.customer","com.trinhtrung.library"})
@EnableJpaRepositories(value = "com.trinhtrung.library.repository")
@EntityScan(value = "com.trinhtrung.library.model")
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }

}
