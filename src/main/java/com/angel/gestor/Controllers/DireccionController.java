package com.angel.gestor.Controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angel.gestor.Models.Direccion;
import com.angel.gestor.Services.DireccionServiceImpl;

@RestController
@RequestMapping("/api/v1/direccion")
@CrossOrigin("http://localhost:4200")
public class DireccionController {

	@Autowired
	DireccionServiceImpl direccionService;
	
	@PostMapping("/direccion")
	public Direccion saveDireccion(@RequestBody Direccion direccion) {
		
		return direccionService.save(direccion);
		
	}
	
	@DeleteMapping("/direccion/{id}")
	public void deleteDireccion(@PathVariable Long id) {
		
		direccionService.deleteById(id);
		
	}
	
	@PutMapping("/direccion/{id}")
	public ResponseEntity<Direccion> updateDireccion(@PathVariable Long id, @RequestBody Direccion direccion) {
		
		return direccionService.updateById(id, direccion);
		
	}
	
	@GetMapping("/direccion/{id}")
	public ResponseEntity<Direccion> findDireccion(@PathVariable Long id) {
		
		return direccionService.findById(id);
		
	}
	
	@GetMapping("/direcciones")
	public Set<Direccion> findDirecciones() {
		
		return direccionService.findAll();
		
	}
	
	
}
