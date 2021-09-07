package com.mitocode.di.empleados.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mitocode.di.empleados.dto.Employees;
import com.mitocode.di.empleados.dto.Excersise4;
import com.mitocode.di.empleados.dto.Job;

public class Excercie4Repository {
	JdbcTemplate jdbcTemplate;

	public double getPay(Employees e, String fechaInicion, String fechaFinal ){
		List <Employees> empleados= new ArrayList();
		List <Job> jobs= new ArrayList();
		empleados=jdbcTemplate.query("select * from employee", new BeanPropertyRowMapper(Employees.class));
		Excersise4 e4=new Excersise4();
		return e4.salario(empleados, e, fechaFinal, fechaFinal);		
	}
}
