package com.uce.edu.demo.bodega.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;
@Repository
public class InventarioRepositoryImpl implements IInventarioRepository {

	@Override
	public void insertar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el inventeraio en la base de datos: "+ i);
	}

	@Override
	public List<Producto> buscarProducto() {
		// TODO Auto-generated method stub
		Producto producto=new Producto();
		List<Producto> pro= new ArrayList<>();
		producto.setNombre("Aceite");
		producto.setCantidad(10);
		producto.setFechaIngreso(LocalDateTime.of(2022, 5,6,7,8));
		producto.setPrecioCompra(new BigDecimal(2.50));
		
		pro.add(producto);
		
		return pro;
	}


}
