package com.overstar.open.export;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class OpenExportApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenExportApplication.class, args);
    }

}
