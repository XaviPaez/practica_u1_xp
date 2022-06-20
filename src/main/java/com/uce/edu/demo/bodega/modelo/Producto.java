package com.uce.edu.demo.bodega.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Producto {

	private String nombre;
	private BigDecimal precioVenta;
	private BigDecimal precioCompra;
	private LocalDateTime fechaIngreso;
	private int cantidad;

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioVenta=" + precioVenta + ", precioCompra=" + precioCompra
				+ ", fechaIngreso=" + fechaIngreso + ", cantidad=" + cantidad + "]";
	}

	// SET Y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	public BigDecimal getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
