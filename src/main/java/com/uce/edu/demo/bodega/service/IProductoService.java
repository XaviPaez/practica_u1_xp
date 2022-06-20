package com.uce.edu.demo.bodega.service;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IProductoService {
	public void insertarProducto(Producto i);

	public Producto buscarProducto(String nombre);

	public void actualizarProducto(Producto p);

	public void eliminarProducto(String nombre);
}
