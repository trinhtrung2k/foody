package com.trinhtrung.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.trinhtrung.library.*","com.trinhtrung.admin.*"})
@EnableJpaRepositories(value = "com.trinhtrung.library.repository")
@EntityScan(value = "com.trinhtrung.library.model")
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}
