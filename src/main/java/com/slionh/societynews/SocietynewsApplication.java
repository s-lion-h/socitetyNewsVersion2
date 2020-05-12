package com.slionh.societynews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
public class SocietynewsApplication {
    public SocietynewsApplication() {
    }
    public static void main(String[] args) {
        SpringApplication.run(SocietynewsApplication.class, args);
    }

}
