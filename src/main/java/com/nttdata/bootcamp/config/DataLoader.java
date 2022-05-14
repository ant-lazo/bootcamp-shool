package com.nttdata.bootcamp.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nttdata.bootcamp.models.Course;
import com.nttdata.bootcamp.models.Student;
import com.nttdata.bootcamp.services.IStudent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	IStudent student;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		/*Course s = new Course();
		s.setName("math");
		List<Course> d = new ArrayList<Course>();
		d.add(s);
		
		student.save(Student.builder()
				.firstName("Omar")
				.lastName("Lazo")
				.telephone("123456789")
				.address("la molina")
				.courses(d)
				.build());
		log.info("se ingreso dato");*/
	}

}
