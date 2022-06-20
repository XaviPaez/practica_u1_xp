package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito: " + d);
	}

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro) {
		// TODO Auto-generated method stub
		List<Deposito> lisDepositos=new ArrayList<>();
		Deposito deposito=new Deposito();
		deposito.setFecha(LocalDateTime.of(2021, 2,10,8,50,2));
		deposito.setMonto(new BigDecimal(20));
		deposito.setNumeroCuentaDestino("2131");
		lisDepositos.add(deposito);
		
		Deposito deposito1=new Deposito();
		deposito1.setFecha(LocalDateTime.of(2022, 2,10,8,50,2));
		deposito1.setMonto(new BigDecimal(10));
		deposito1.setNumeroCuentaDestino("1131");
		lisDepositos.add(deposito1);
		
		return lisDepositos;
	}

}
