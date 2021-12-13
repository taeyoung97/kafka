package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.domain.KafkaDomain;
import com.example.demo.repository.KafkaRepository;


@Service
public class KafkaProducerService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    String kafkaTopic = "message";

    public void send(String message) {
    		
        kafkaTemplate.send(kafkaTopic, message);
    }
    

    KafkaRepository map;
	
	public void create(String message) {
		KafkaDomain dm = new KafkaDomain( message);
		map.save(dm);
	}
}
