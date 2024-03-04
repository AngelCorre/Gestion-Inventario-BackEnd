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

import com.angel.gestor.Models.Producto;
import com.angel.gestor.Services.ProductoServiceImpl;

@RestController
@RequestMapping("/api/v1/producto")
@CrossOrigin("http://localhost:4200")
public class ProductoController {

	@Autowired
	ProductoServiceImpl productoService;
	
	@PostMapping("/producto")
	public Producto saveProduct(@RequestBody Producto producto) {
		
		return productoService.save(producto);
		
	}
	
	@DeleteMapping("/producto/{id}")
	public void deleteProduct(@PathVariable Long id) {
		
		productoService.deleteById(id);
		
	}
	
	@PutMapping("/producto/{id}")
	public ResponseEntity<Producto> updateProduct(@PathVariable Long id, @RequestBody Producto producto) {
		
		return productoService.updateById(id, producto);
		
	}
	
	@GetMapping("/producto/{id}")
	public ResponseEntity<Producto> findProduct(@PathVariable Long id) {
		
		return productoService.findById(id);
		
	}
	
	@GetMapping("/productos")
	public List<Producto> findProducts() {
		
		return productoService.findAll();
		
	}
	
}
