package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IGestorInventarioRepository;

@Service
public class GestorInventarioServiceImpl implements IGestorInventarioService {
	@Autowired
	private IProductoService iProductoService;
	@Autowired
	private IGestorInventarioRepository gestorInventarioRepository;
	@Autowired
	private IInventarioService iInventarioService;

	@Override
	public BigDecimal precioVenta(Producto p) {
		// TODO Auto-generated method stub
		
		BigDecimal pCompra=p.getPrecioCompra();
		BigDecimal ganacia=pCompra.multiply(new BigDecimal(10)).divide(new BigDecimal(100));
		BigDecimal iva=pCompra.multiply(new BigDecimal(12)).divide(new BigDecimal(100));
		BigDecimal pVenta=pCompra.add(ganacia).add(iva);
		
		return pVenta;
	}


	@Override
	public List<Producto> consultar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		List<Producto> lista=this.iInventarioService.buscarProductos();
		List<Producto> listaF=new ArrayList<>();
		for(Producto p: lista) {
			if(p.getFechaIngreso().compareTo(fecha)>0) {
				p.setPrecioVenta(this.precioVenta(p));
				listaF.add(p);
				System.out.println(p.getNombre()+"-"+p.getCantidad()+"-"+ p.getPrecioVenta()+"-"+p.getFechaIngreso());
			}
		}
		return listaF;
	}

}
