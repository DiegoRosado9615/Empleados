package com.mitocode.di.empleado.service;

import java.util.List;

import com.mitocode.di.empleados.dto.Employees;
import com.mitocode.di.empleados.repository.Excercie4Repository;

public class Excersise4ServiceImpl implements Excersice4Service {
	Excercie4Repository excercie4Repository;
	@Override
	public double getSalary(List <Employees> exployers,Employees e ,String fI,String fF) {
		return excercie4Repository.getPay(e, fF, fI);
	}
}
