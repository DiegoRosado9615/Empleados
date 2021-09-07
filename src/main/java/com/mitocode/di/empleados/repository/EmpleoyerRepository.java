package com.mitocode.di.empleados.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mitocode.di.empleados.dto.Employees;
import com.mitocode.di.empleados.dto.Job;

public class EmpleoyerRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;
		public List<Employees> getEmployer(){
			List <Employees> empleados= new ArrayList();
			empleados=jdbcTemplate.query("select * from employee", new BeanPropertyRowMapper(Employees.class));	
			return empleados;		
		}
		
		public boolean empleoyerExist(Employees e) {
			List<Employees> listOfEmpleoyer=getEmployer();
			for (int i=0 ; i<listOfEmpleoyer.size();i++) {
				String name=listOfEmpleoyer.get(i).getName();
				String lastName=listOfEmpleoyer.get(i).getLastName();
				if (e.existeNombre(name, lastName)) return false;
			}
			return true;
		}
		
		public boolean esMayorEdad(int id) {
			Employees e=new Employees();
			e= jdbcTemplate.queryForObject("select * from employee where id =" + id+";", new RowMapper<Employees>() {
				@Override
				public Employees mapRow(ResultSet rs,int rowNum ) throws SQLException{
					Employees e=new Employees();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setLastName(rs.getString(3));
					e.setBirthdate(rs.getString(4));
					return e;
				}
			});
			return e.esMayorEdad(e.getBirthdate());	
		}
		
		public boolean existJob(Employees e) {
			List <Job> jobs= new ArrayList();
			jobs=jdbcTemplate.query("select * from jobs", new BeanPropertyRowMapper(Employees.class));
			return e.existeTrabajo(jobs); 
		}
		
}
		


