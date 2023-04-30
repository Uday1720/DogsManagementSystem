package com.classes.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.classes.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);

}
