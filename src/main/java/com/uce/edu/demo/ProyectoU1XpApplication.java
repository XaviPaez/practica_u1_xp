package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.service.IGestorInventarioService;
import com.uce.edu.demo.bodega.service.IInventarioService;
import com.uce.edu.demo.bodega.service.IProductoService;

@SpringBootApplication
public class ProyectoU1XpApplication implements CommandLineRunner {


	@Autowired
	private IProductoService iProductoService;
	@Autowired
	private IInventarioService iInventarioService;
	@Autowired
	private IGestorInventarioService gestorInventarioService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1XpApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Producto producto=new Producto();
		Inventario inventario=new Inventario();
		List<Producto> productos=new ArrayList<>();
		
		producto.setNombre("Aceite");
		producto.setPrecioCompra(new BigDecimal(2.50));
		producto.setCantidad(100);
		producto.setPrecioVenta(this.gestorInventarioService.precioVenta(producto));
		producto.setFechaIngreso(LocalDateTime.of(2022, 5, 6, 7, 8));
		
		productos.add(producto);
		
		inventario.setBodega("123");
		inventario.setProducto(productos);
		
		this.iInventarioService.insertarInventario(inventario);
		
		System.out.println("\n    MEGA SANTA MARIA ");
		System.out.println("\n  Reporte de Inventario ");
		
		System.out.println("\n Fecha 1: "+ LocalDateTime.of(2020, 2, 1, 12, 9, 21));
		this.gestorInventarioService.consultar(LocalDateTime.of(2020, 2, 1, 12, 10, 11));
		
		System.out.println("\n Fecha 2: "+ LocalDateTime.of(2022, 1, 1, 12, 10, 11));
		this.gestorInventarioService.consultar(LocalDateTime.of(2022, 1, 1, 12, 10, 11));
		
	}

}
