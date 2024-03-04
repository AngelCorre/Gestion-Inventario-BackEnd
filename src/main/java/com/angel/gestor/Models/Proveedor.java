package com.angel.gestor.Models;


import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Proveedor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "proveedor_descripcion", length = 60, nullable = false)
	private String proveedor_descripcion;
	
	@ManyToOne(targetEntity = Producto.class ,fetch = FetchType.EAGER)
	@JoinColumn(name = "id_producto", nullable = false)
	private Producto producto;
	
	@OneToOne
	@JoinColumn(name = "id_direccion", nullable = false)
	private Direccion direccion;

	public Proveedor(Long id, String proveedor_descripcion, Producto producto, Direccion direccion) {
		super();
		this.id = id;
		this.proveedor_descripcion = proveedor_descripcion;
		this.producto = producto;
		this.direccion = direccion;
	}

	public Proveedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProveedor_descripcion() {
		return proveedor_descripcion;
	}

	public void setProveedor_descripcion(String proveedor_descripcion) {
		this.proveedor_descripcion = proveedor_descripcion;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	
	
}
