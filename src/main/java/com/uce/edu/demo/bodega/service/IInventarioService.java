package com.uce.edu.demo.bodega.service;

import com.uce.edu.demo.bodega.modelo.Inventario;

public interface IInventarioService {
	public void insertarInventario(Inventario i);

	public Inventario buscarInventario(String nombre);

	public void actualizarInventario(Inventario p);

	public void eliminarInventario(String nombre);
}
