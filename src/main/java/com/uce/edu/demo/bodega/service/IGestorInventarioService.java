package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;

public interface IGestorInventarioService {

	public void realizarCalculo(String nombre,BigDecimal precioVenta, BigDecimal precioCompra);
	public void imprimir(String nombre,BigDecimal precioVenta, BigDecimal precioCompra);
}
