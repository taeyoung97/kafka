package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class KafkaApplication {
	

	public static void main(String[] args) {	
		SpringApplication.run(KafkaApplication.class, args);
	}
	
	@KafkaListener(topics = "message", groupId = "group-id")
    public void listen(String message) {
		
        System.out.println("받은 메시지 : " + message);
              
    }
}
