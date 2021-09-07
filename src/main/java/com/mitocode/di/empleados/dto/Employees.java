package com.mitocode.di.empleados.dto;
import java.util.Date;
import java.util.List;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
//import Job;
public class Employees {
	 private int id;
	 private String name;
	 private String lastName;
	 private String birthdate;
	 private Job job;
	 private Gender gender;
	 
		public boolean existeNombre(String name, String lastName) {
			return this.name.equals(name) && this.lastName.equals(lastName);
		}
		
		public boolean esMayorEdad(String birthdate) {
			//x="15-05-1983"
			String day=birthdate.substring(0, 2);
			String month=birthdate.substring(3, 5);
			String year=birthdate.substring(6, 10);
	        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDate fechaNac = LocalDate.parse(day +"/" +month + "/" + year, fmt);
	        LocalDate ahora = LocalDate.now();
	        Period periodo = Period.between(fechaNac, ahora);
	        if(periodo.getYears()>18)return true;
	        if(periodo.getYears()<17)return false;
	        int mothNumber=Integer.parseInt(month);
	        if(12 < periodo.getMonths()+mothNumber ) return true;
	        return false;            
		}
		
		
		public boolean existeTrabajo(List<Job> listJob) {
			for (int i=0; i<listJob.size();i++ ) {
				if(this.getJob().equals(listJob.get(i))) return true;
			}
			return false;	
		}
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	 public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	 
	 
}//class
