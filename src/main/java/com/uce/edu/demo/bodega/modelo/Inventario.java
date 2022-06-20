package com.uce.edu.demo.bodega.modelo;

import java.time.LocalDateTime;

public class Inventario {

	private Producto producto;
	private LocalDateTime fechaIngreso;
	
	
	@Override
	public String toString() {
		return "Inventario [producto=" + producto + ", fechaIngreso=" + fechaIngreso + "]";
	}
	//SET Y GET
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
}
