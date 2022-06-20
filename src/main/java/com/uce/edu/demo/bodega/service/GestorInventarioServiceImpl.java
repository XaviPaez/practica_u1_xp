package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.GestorInventario;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IGestorInventarioRepository;

@Service
public class GestorInventarioServiceImpl implements IGestorInventarioService {
	@Autowired
	private IProductoService iProductoService;
	@Autowired
	private IGestorInventarioRepository gestorInventarioRepository;


	@Override
	public void realizarCalculo(String nombre, BigDecimal precioVenta, BigDecimal precioCompra) {
		// TODO Auto-generated method stub
		Producto producto = this.iProductoService.buscarProducto(nombre);
		BigDecimal pCompra = producto.getPrecioCompra();
		BigDecimal ganancia = pCompra.multiply(new BigDecimal(0.1));
		BigDecimal iva = pCompra.multiply(new BigDecimal(0.12));
		BigDecimal pVenta=pCompra.add(ganancia).add(iva);
		this.iProductoService.actualizarProducto(producto);
		
		GestorInventario gestorInventario= new GestorInventario();
		gestorInventario.setNombre(nombre);
		gestorInventario.setFechaIngreso(LocalDateTime.now());
		gestorInventario.setpVenta(precioVenta);
		this.gestorInventarioRepository.realizar(gestorInventario);
		
	}


	@Override
	public void imprimir(String nombre, BigDecimal precioVenta, BigDecimal precioCompra) {
		// TODO Auto-generated method stub


	}

}
