package com.angel.gestor.Models;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "producto_descripcion", length = 30, nullable = false, unique = true)
	private String producto_descripcion;
	
	@Column(name = "precio")
	private double precio;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@OneToMany(targetEntity = Proveedor.class ,cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "producto")
	@JsonIgnore
	private List<Proveedor> proveedores;
	

	public Producto(Long id, String producto_descripcion, double precio, int cantidad) {
		super();
		this.id = id;
		this.producto_descripcion = producto_descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProducto_descripcion() {
		return producto_descripcion;
	}

	public void setProducto_descripcion(String producto_descripcion) {
		this.producto_descripcion = producto_descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public List<Proveedor> getProveedores() {
		return proveedores;
	}

	public void setProveedores(List<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}
	
	

}
