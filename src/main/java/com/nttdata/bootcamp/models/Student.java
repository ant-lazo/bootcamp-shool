package com.nttdata.bootcamp.models;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "students")
@Data
@Builder
public class Student {
	
	private String id;
	private String firstName;
	private String lastName;
	private String telephone;
	private String address;
	private List<Course> courses;
	private String enabled;

}
