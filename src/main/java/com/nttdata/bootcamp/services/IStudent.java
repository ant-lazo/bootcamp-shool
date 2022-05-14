package com.nttdata.bootcamp.services;

import java.util.List;

import com.nttdata.bootcamp.models.Student;

public interface IStudent {
	
	public List<Student> findAll();
	
	public List<Student> findByAddress(String address);
	
	public Student findById(String id);
	
	public void save(Student student);

}
