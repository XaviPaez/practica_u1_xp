package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Inventario;
@Repository
public class InventarioRepositoryImpl implements IInventarioRepository {

	@Override
	public void insertar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el inventario: "+i);
	}

	@Override
	public Inventario buscar(String nombre) {
		// TODO Auto-generated method stub
		Inventario inventario=new Inventario();
		inventario.setFechaIngreso(LocalDateTime.now());
		return inventario;
	}

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el inventario: "+ i);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado: "+ nombre);
	}

}
