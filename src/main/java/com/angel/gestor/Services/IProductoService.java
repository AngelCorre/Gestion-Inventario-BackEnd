package com.angel.gestor.Services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.angel.gestor.Models.Producto;

public interface IProductoService {

	public Producto save(Producto producto);
	
	public void deleteById(Long id);
	
	public ResponseEntity<Producto> updateById(Long id, Producto producto);
	
	public ResponseEntity<Producto> findById(Long id);
	
	public List<Producto> findAll();
	
}
