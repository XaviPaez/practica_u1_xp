package com.uce.edu.demo.bodega.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.repository.IInventarioRepository;
@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired
	private IInventarioRepository iInventarioRepository;
	
	@Override
	public void insertarInventario(Inventario i) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.insertar(i);
	}

	@Override
	public Inventario buscarInventario(String nombre) {
		// TODO Auto-generated method stub
		return this.iInventarioRepository.buscar(nombre);
	}

	@Override
	public void actualizarInventario(Inventario p) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.actualizar(p);
	}

	@Override
	public void eliminarInventario(String nombre) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.eliminar(nombre);
	}

}
