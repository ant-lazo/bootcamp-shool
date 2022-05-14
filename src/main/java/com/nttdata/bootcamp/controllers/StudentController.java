package com.nttdata.bootcamp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.models.CountStudentByCourse;
import com.nttdata.bootcamp.models.Course;
import com.nttdata.bootcamp.models.Student;
import com.nttdata.bootcamp.services.IStudent;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	IStudent studentrepo;
	
	@GetMapping("/find-all")
	public List<Student> findAll(){
		return studentrepo.findAll();
	}
	
	@GetMapping("/find-id/{id}")
	public Student findById(@PathVariable String id){
		return studentrepo.findById(id);
	}
	
	@PostMapping("/create")
	public void save(@RequestBody Student student){
		student.setEnabled("1");
		studentrepo.save(student);
	}
	
	@PutMapping("/edit")
	public void edit(@RequestBody Student student) {
		Student st = studentrepo.findById(student.getId());
		st.setFirstName(student.getFirstName());
		st.setLastName(student.getLastName());
		st.setAddress(student.getAddress());
		st.setTelephone(student.getTelephone());
		st.setCourses(student.getCourses());
		st.setEnabled(student.getEnabled());
		studentrepo.save(st);
	}
	
	@PatchMapping("/logicDelete/{id}")
	public void logicDelete(@PathVariable String id) {
		Student student = studentrepo.findById(id);
		student.setEnabled("0");
		studentrepo.save(student);
	}
	
	@GetMapping("/count-student/{course}")
	public CountStudentByCourse countStudentByCourse(@PathVariable String course){
		List<Student> students = studentrepo.findAll();
		List<String> nombres = new ArrayList<String>();
		for(Student s : students) {
			for (Course c: s.getCourses()) {
				if(c.getName().equals(course)) {
					nombres.add(c.getName());
				}
			}
		}
		CountStudentByCourse c = new CountStudentByCourse(course, String.valueOf(nombres.size()));
		return c;
	}

}
