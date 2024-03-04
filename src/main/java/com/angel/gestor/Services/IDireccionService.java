package com.angel.gestor.Services;

import java.util.Set;

import org.springframework.http.ResponseEntity;

import com.angel.gestor.Models.Direccion;

public interface IDireccionService {
	
	public Direccion save(Direccion direccion);
	
	public void deleteById(Long id);
	
	public ResponseEntity<Direccion> updateById(Long id, Direccion direccion);
	
	public ResponseEntity<Direccion> findById(Long id);
	
	public Set<Direccion> findAll();

}
