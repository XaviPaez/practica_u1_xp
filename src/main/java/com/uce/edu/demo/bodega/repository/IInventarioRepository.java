package com.uce.edu.demo.bodega.repository;

import com.uce.edu.demo.bodega.modelo.Inventario;

public interface IInventarioRepository {
	public void insertar(Inventario i);

	public Inventario buscar(String nombre);

	public void actualizar(Inventario p);

	public void eliminar(String nombre);
}
