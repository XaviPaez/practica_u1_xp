package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.IDepositoRepository;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;
import com.uce.edu.demo.banco.to.TransaccionTo;

@Service
public class TransaccionServiceImpl implements ItransaccionService {
	@Autowired
	private ITransferenciaService iTransferenciaService;
	@Autowired
	private IDepositoService depositoService;
	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;
	@Autowired
	private IDepositoRepository depositoRepository;

	@Override
	public void transferencia(String origen, String destino, BigDecimal monto) {
		// TODO Auto-generated method stub

		this.iTransferenciaService.realizarTransferencia(origen, destino, monto);
	}

	@Override
	public void deposito(String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.depositoService.realizarDeposito(destino, monto);
	}

	@Override
	public void retiro(String ctaRetiro, BigDecimal monto) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<TransaccionTo> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fevhaFin) {

		// TODO Auto-generated method stub
		List<Transferencia> listaTrans = this.iTransferenciaRepository.consultar(cuenta, fechaInicio, fevhaFin);
		List<Deposito> listaDepo = this.depositoRepository.consultar(cuenta, fechaInicio, fevhaFin);
		// Vamos a unir todas las listas
		List<TransaccionTo> listaFinaList = new ArrayList<>();
		for (Transferencia t : listaTrans) {
			TransaccionTo transaccionTo = this.transformar(t);
			listaFinaList.add(transaccionTo);
		}
		for (Deposito d : listaDepo) {
			TransaccionTo transaccionTo = this.transformar(d);
			listaFinaList.add(transaccionTo);
		}
		return listaFinaList;
	}

	private TransaccionTo transformar(Transferencia transferencia) {
		TransaccionTo transaccionTo = new TransaccionTo();
		transaccionTo.setFecha(transferencia.getFecha());
		transaccionTo.setMonto(transferencia.getMontoTransferir());
		transaccionTo.setTipo("T");
		return transaccionTo;
	}

	private TransaccionTo transformar(Deposito deposito) {
		TransaccionTo transaccionTo = new TransaccionTo();
		transaccionTo.setFecha(deposito.getFecha());
		transaccionTo.setMonto(deposito.getMonto());
		transaccionTo.setTipo("D");
		return transaccionTo;
	}

}
