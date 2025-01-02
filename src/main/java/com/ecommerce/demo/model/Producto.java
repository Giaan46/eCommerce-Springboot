package com.ecommerce.demo.model;

public class Producto {
	
	private int id;
	private String nombre;
	private String secripcion;
	private String imagen;
	private double precio;
	private int cantidad;
	
	
	public Producto(int id, String nombre, String secripcion, String imagen, double precio, int cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.secripcion = secripcion;
		this.imagen = imagen;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public Producto() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSecripcion() {
		return secripcion;
	}
	public void setSecripcion(String secripcion) {
		this.secripcion = secripcion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
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
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", secripcion=" + secripcion + ", imagen=" + imagen
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	

}
