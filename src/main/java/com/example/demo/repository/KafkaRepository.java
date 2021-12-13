package com.example.demo.repository;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.KafkaDomain;


//DB레이어 접근자를 의미
@Repository
@Mapper
public interface KafkaRepository extends JpaRepository<KafkaDomain,String>{
	
	//NullPointException 에러를 방지하기 위해서
	@Query
	Optional<KafkaDomain> findById(String id);
	
	@Query
	Optional<KafkaDomain> findByMessage(String message);
	
}
