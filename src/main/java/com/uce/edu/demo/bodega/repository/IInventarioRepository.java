package com.uce.edu.demo.bodega.repository;

import java.util.List;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

public interface IInventarioRepository {
	public void insertar(Inventario i);

	public List<Producto> buscarProducto();
}
