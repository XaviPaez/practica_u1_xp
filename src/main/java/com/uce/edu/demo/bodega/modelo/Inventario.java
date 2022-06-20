package com.uce.edu.demo.bodega.modelo;

import java.util.List;

public class Inventario {

	private List<Producto> producto;
	private String bodega;
	
	
	@Override
	public String toString() {
		return "Inventario [producto=" + producto + ", bodega=" + bodega + "]";
	}


	public List<Producto> getProducto() {
		return producto;
	}


	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}


	public String getBodega() {
		return bodega;
	}


	public void setBodega(String bodega) {
		this.bodega = bodega;
	}


	
	
}
