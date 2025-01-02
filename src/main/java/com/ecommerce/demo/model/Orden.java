package com.ecommerce.demo.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ordenes")
public class Orden {
	private int id;
	private String numero;
	private Date fechaCreacion;
	private Date FechaDeRecibida;
	
	private double total;
	private Usuario usuario;
	
	public Orden() {
	
	}

	public Orden(int id, String numero, Date fechaCreacion, Date fechaDeRecibida, double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		FechaDeRecibida = fechaDeRecibida;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaDeRecibida() {
		return FechaDeRecibida;
	}

	public void setFechaDeRecibida(Date fechaDeRecibida) {
		FechaDeRecibida = fechaDeRecibida;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", FechaDeRecibida="
				+ FechaDeRecibida + ", total=" + total + "]";
	}
 
}
