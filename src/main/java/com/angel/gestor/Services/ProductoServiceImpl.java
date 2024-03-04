package com.angel.gestor.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.angel.gestor.Models.Producto;
import com.angel.gestor.Repositories.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService{

	
	@Autowired
	IProductoRepository productoRepository;
	
	@Override
	public Producto save(Producto producto) {

		return productoRepository.save(producto);
		
	}

	@Override
	public void deleteById(Long id) {
		
		productoRepository.deleteById(id);
		
	}

	@Override
	public ResponseEntity<Producto> updateById(Long id, Producto productoDetalles) {
		
		Producto producto = productoRepository.findById(id).orElse(null);
		
		producto.setProducto_descripcion(productoDetalles.getProducto_descripcion());
		producto.setPrecio(productoDetalles.getPrecio());
		producto.setCantidad(productoDetalles.getCantidad());
		
		Producto productoU = productoRepository.save(producto);
		
		return ResponseEntity.ok(productoU);
		
	}

	@Override
	public ResponseEntity<Producto> findById(Long id) {
		
		Producto producto = productoRepository.findById(id).orElse(null);
		
		return ResponseEntity.ok(producto);
		
	}

	@Override
	public List<Producto> findAll() {
		
		return productoRepository.findAll();
		
	}
	
	

}
