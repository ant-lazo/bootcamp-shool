package com.nttdata.bootcamp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.models.Student;
import com.nttdata.bootcamp.repositories.StudentRepo;

@Service
public class StudentImp implements IStudent{

	@Autowired
	StudentRepo studentRepo;
	
	@Override
	public List<Student> findAll() {
		return (List<Student>) studentRepo.findAll();
	}

	@Override
	public List<Student> findByAddress(String address) {
		return studentRepo.findByAddress(address);
	}
	
	@Override
	public Student findById(String id) {
		return studentRepo.findById(id).orElse(null);
	}

	@Override
	public void save(Student student) {
		studentRepo.save(student);
	}

}
