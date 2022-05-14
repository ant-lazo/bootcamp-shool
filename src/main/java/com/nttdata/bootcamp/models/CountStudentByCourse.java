package com.nttdata.bootcamp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountStudentByCourse {
	private String nombre;
	private String cantidad;
}
