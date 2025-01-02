package com.ecommerce.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "ordenes")
public class Orden {
	private int id;
	private String numero;
	private Date fechaCreacion;
	private Date FechaDeRecibida;
	
	private double total;
	@ManyToOne
	private Usuario usuario;
	@OneToOne(mappedBy = "orden")
	private DetalleOrden detalle;
	
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

	public DetalleOrden getDetalle() {
		return detalle;
	}

	public void setDetalle(DetalleOrden detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", FechaDeRecibida="
				+ FechaDeRecibida + ", total=" + total + "]";
	}
 
}
