package com.spring.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.demo.entity.Gymnases;

public interface GymnaseRepository extends MongoRepository<Gymnases,Long>{
	
	List<Gymnases>findAll();
}
