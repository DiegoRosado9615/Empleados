package com.mitocode.di.empleado.service;

import com.mitocode.di.empleados.dto.Employees;

public interface EmpleadoService {
	/**
	 * Nos permite saber si ya existe  un empleado con ese nombre y apellido
	 * @return boolean
	 */
	public boolean existeEmpleado(Employees e);
	
	/**
	 * Nos permite saber si el usuario es mayor de edad, contempla unicamente los caso si la persona tiene más de 18 años 
	 * cumplido y tambien contempla meses no contempla dias 
	 */
	public boolean esMayorEdad(int i);
	
	/**
	 * Nos permite saber si el trabajo existe o no existe
	 * 
	 */
	public boolean existeTrabajo(Employees e);

	
	
	

}
