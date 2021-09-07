package com.mitocode.di.empleados.dto;

import java.util.List;
import java.util.Date;
public class Excersise4 {
	public Excersise4() {
		
	}
	public boolean existeEmpleado(List <Employees> exployers,Employees e) {
		for (int i=0;i<exployers.size();i++) {
			if (e.getId()==exployers.get(i).getId() ) return true;
		}
		return false;
	}
	
	public double salario(List <Employees> exployers,Employees e ,String fI,String fF) {
		String day=fI.substring(0, 2);
		String month=fI.substring(3, 5);
        String month2=fF.substring(3, 5);
		String year=fI.substring(6, 10);
		String year2=fF.substring(6, 10);
		if(existeEmpleado(exployers,e))return -1;
		int totalA= Integer.parseInt(year2)-Integer.parseInt(year);
        System.out.println(totalA);
        if (totalA<0) return -1;
        int meses=Integer.parseInt(month)+Integer.parseInt(month2);
        if(meses>=12)totalA++;
        meses=meses-12;
        double ganado=12*e.getJob().getSalary();
        if (meses==0) return ganado;
        double diferenciaMeses=meses *e.getJob().getSalary();
        ganado = ganado+diferenciaMeses;
		return ganado;
	}
}
