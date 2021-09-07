package com.mitocode.di.empleado.service;
import com.mitocode.di.empleados.dto.Employees;
import com.mitocode.di.empleados.repository.EmpleoyerRepository;

public class EmpleadoServiceImpl implements EmpleadoService {
	private EmpleoyerRepository empleoyerRepository;
	
	@Override
	public boolean existeEmpleado(Employees e) {
		// TODO Auto-generated method stub
		return empleoyerRepository.empleoyerExist(e);
	}
	
	public boolean esMayorEdad(int i) {
		return empleoyerRepository.esMayorEdad(i);
	}
	
	

}
