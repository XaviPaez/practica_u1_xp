package com.uce.edu.demo.bodega.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IProductoRepository;
@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepository iProductoRepository;
	
	@Override
	public void insertarProducto(Producto i) {
		// TODO Auto-generated method stub
		this.iProductoRepository.insertar(i);
	}

	@Override
	public Producto buscarProducto(String nombre) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.buscar(nombre);
	}

	@Override
	public void actualizarProducto(Producto p) {
		// TODO Auto-generated method stub
		this.iProductoRepository.actualizar(p);
	}

	@Override
	public void eliminarProducto(String nombre) {
		// TODO Auto-generated method stub
		this.iProductoRepository.eliminar(nombre);
	}


	}


