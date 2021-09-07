package com.mitocode.di.empleados.crontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mitocode.di.empleado.service.EmpleadoService;
import com.mitocode.di.empleados.dto.Employees;

@RestController
@RequestMapping("/empleados")

public class EmployerController {
	EmpleadoService empleadoService;
	@PostMapping(consumes="application/json")
	public ResponseEntity<Object> existeNombre(@RequestBody  Employees e){
		return  new ResponseEntity<>( empleadoService.existeEmpleado(e) ,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getUser(@PathVariable int id){
		return new ResponseEntity<>(empleadoService.esMayorEdad(id) ,HttpStatus.OK);
	}
	
	 
	

}
