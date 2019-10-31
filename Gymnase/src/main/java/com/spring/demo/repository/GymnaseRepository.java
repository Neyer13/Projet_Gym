package com.spring.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.demo.document.Gymnase;

public interface GymnaseRepository extends MongoRepository<Gymnase, Long>{

	
}
