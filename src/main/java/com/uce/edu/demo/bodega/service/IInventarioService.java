package com.uce.edu.demo.bodega.service;

import java.util.List;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

public interface IInventarioService {
	public void insertarInventario(Inventario i);

	public Inventario buscarInventario(String nombre);

	public void actualizarInventario(Inventario p);

	public void eliminarInventario(String nombre);
	
	public List<Producto> buscarProductos();
}
