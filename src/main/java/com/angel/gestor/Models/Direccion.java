package com.angel.gestor.Models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "direcciones")
public class Direccion implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "estado", length = 40, nullable = false)
	private String estado;
	
	@Column(name = "colonia", length = 40, nullable = false)
	private String colonia;
	
	@Column(name = "calle", length = 40, nullable = false)
	private String calle;
	
	@Column(name = "lote", nullable = false)
	private String lt;
	
	@Column(name = "manzana", nullable = false)
	private String mz;
	
	@OneToOne(mappedBy = "direccion")
	@JsonIgnore
	private Proveedor proveedor;

	public Direccion(Long id, String estado, String colonia, String calle, String lt, String mz) {
		super();
		this.id = id;
		this.estado = estado;
		this.colonia = colonia;
		this.calle = calle;
		this.lt = lt;
		this.mz = mz;
	}

	public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getLt() {
		return lt;
	}

	public void setLt(String lt) {
		this.lt = lt;
	}

	public String getMz() {
		return mz;
	}

	public void setMz(String mz) {
		this.mz = mz;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	
	
	
}
