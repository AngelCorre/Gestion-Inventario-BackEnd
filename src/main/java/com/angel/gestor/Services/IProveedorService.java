package com.angel.gestor.Services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.angel.gestor.Models.Proveedor;

public interface IProveedorService {
	
	public Proveedor save(Proveedor proveedor);
	
	public void deleteById(Long id);
	
	public ResponseEntity<Proveedor> updateById(Long id, Proveedor proveedor);
	
	public ResponseEntity<Proveedor> findById(Long id);
	
	public List<Proveedor> findAll();

}
