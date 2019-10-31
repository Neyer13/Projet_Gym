package com.spring.demo.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.demo.entity.Gymnases;

public interface GymnaseRepository extends MongoRepository<Gymnases,String>{
	
	List<Gymnases>findAll();
}
