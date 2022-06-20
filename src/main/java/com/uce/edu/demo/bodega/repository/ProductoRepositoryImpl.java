package com.uce.edu.demo.bodega.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Producto;
@Repository
public class ProductoRepositoryImpl implements IProductoRepository {

	@Override
	public void insertar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el producto: "+ p);
	}

	@Override
	public Producto buscar(String nombre) {
		// TODO Auto-generated method stub
		Producto producto=new Producto();
		producto.setNombre(nombre);
		return producto;
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el producto: "+ p);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el producto: "+ nombre);
	}

}
