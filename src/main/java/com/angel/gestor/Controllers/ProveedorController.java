package com.angel.gestor.Controllers;

import java.util.List;

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

import com.angel.gestor.Models.Proveedor;
import com.angel.gestor.Services.ProveedorServiceImpl;

@RestController
@RequestMapping("/api/v1/proveedor")
@CrossOrigin("http://localhost:4200")
public class ProveedorController {

	@Autowired
	ProveedorServiceImpl proveedorService;
	
	@PostMapping("/proveedor")
	public Proveedor saveProveedor(@RequestBody Proveedor proveedor) {
		
		return proveedorService.save(proveedor);
		
	}
	
	@DeleteMapping("/proveedor/{id}")
	public void deleteProveedor(@PathVariable Long id) {
		
		proveedorService.deleteById(id);
		
	}
	
	@PutMapping("/proveedor/{id}")
	public ResponseEntity<Proveedor> updateProveedor(@PathVariable Long id, @RequestBody Proveedor proveedor) {
		
		return proveedorService.updateById(id, proveedor);
		
	}
	
	@GetMapping("/proveedor/{id}")
	public ResponseEntity<Proveedor> findProveedor(@PathVariable Long id) {
	
		return proveedorService.findById(id);
		
	}
	
	@GetMapping("/proveedores")
	public List<Proveedor> findProveedores() {
		
		return proveedorService.findAll();
		
	}
	
}
