package com.angel.gestor.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.angel.gestor.Models.Proveedor;
import com.angel.gestor.Repositories.IProveedorRepository;

@Service
public class ProveedorServiceImpl implements IProveedorService{
	
	@Autowired
	IProveedorRepository proveedorRepository;

	@Override
	public Proveedor save(Proveedor proveedor) {
		
		return proveedorRepository.save(proveedor);
		
	}

	@Override
	public void deleteById(Long id) {
		
		proveedorRepository.deleteById(id);
		
	}

	@Override
	public ResponseEntity<Proveedor> updateById(Long id, Proveedor proveedorD) {
		
		Proveedor proveedor = proveedorRepository.findById(id).orElse(null);
		
		proveedor.setProveedor_descripcion(proveedorD.getProveedor_descripcion());
		proveedor.setProducto(proveedorD.getProducto());
		proveedor.setDireccion(proveedorD.getDireccion());
		
		Proveedor proveedorU = proveedorRepository.save(proveedor);
		
		return ResponseEntity.ok(proveedorU);
		
	}

	@Override
	public ResponseEntity<Proveedor> findById(Long id) {
		
		Proveedor proveedor = proveedorRepository.findById(id).orElse(null);
		
		return ResponseEntity.ok(proveedor);
		
	}

	@Override
	public List<Proveedor> findAll() {
		return proveedorRepository.findAll();
	}

}
