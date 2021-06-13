package com.yunseong.logbackstudy;

import com.yunseong.logbackstudy.entity.Log;
import com.yunseong.logbackstudy.entity.LogRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LogbackstudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogbackstudyApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(LogRepository logRepository) {
        return (args) -> {
            logRepository.save(new Log("test"));
        };
    }
}
