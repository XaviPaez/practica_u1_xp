package com.uce.edu.demo.bodega.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IInventarioRepository;
@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired
	private IInventarioRepository iInventarioRepository;
	

	@Override
	public Inventario buscarInventario(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarInventario(Inventario p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarInventario(String nombre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Producto> buscarProductos() {
		// TODO Auto-generated method stub
		return this.iInventarioRepository.buscarProducto();
	}

	@Override
	public void insertarInventario(Inventario i) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.insertar(i);
	}


}
