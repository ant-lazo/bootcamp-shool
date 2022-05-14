package com.nttdata.bootcamp.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nttdata.bootcamp.models.Student;

public interface StudentRepo extends MongoRepository<Student, String> {

	public List<Student> findByAddress(String address);
}
