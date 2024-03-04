package com.angel.gestor.Services;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.angel.gestor.Models.Direccion;
import com.angel.gestor.Repositories.IDireccionRepository;

@Service
public class DireccionServiceImpl implements IDireccionService{
	
	@Autowired
	IDireccionRepository direccionRepository;

	@Override
	public Direccion save(Direccion direccion) {
		
		return direccionRepository.save(direccion);
		
	}

	@Override
	public void deleteById(Long id) {
		
		direccionRepository.deleteById(id);
		
	}

	@Override
	public ResponseEntity<Direccion> updateById(Long id, Direccion direccionDetalles) {
		
		Direccion direccion = direccionRepository.findById(id).orElse(null);
		
		direccion.setEstado(direccionDetalles.getEstado());
		direccion.setColonia(direccionDetalles.getColonia());
		direccion.setCalle(direccionDetalles.getCalle());
		direccion.setLt(direccionDetalles.getLt());
		direccion.setMz(direccionDetalles.getMz());
		
		Direccion direccionU = direccionRepository.save(direccion);
		
		return ResponseEntity.ok(direccionU);
		
	}

	@Override
	public ResponseEntity<Direccion> findById(Long id) {
		
		Direccion direccion = direccionRepository.findById(id).orElse(null);
		
		return ResponseEntity.ok(direccion);
		
	}

	@Override
	public Set<Direccion> findAll() {
		
		return new LinkedHashSet<>(direccionRepository.findAll());
		
	}

}
