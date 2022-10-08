package model;

import java.util.Date;

public class Hospedagem {
	private int codigo;
	private Date dataEntrada;
	private Date dataSaida;
	private Hospede hospede;
	private int aposento;
	private Conta conta;
	
	public Hospedagem() {
		
	}
	
	public Hospedagem(int codigo, Date dataEntrada, Date dataSaida, Hospede hospede, int aposento, Conta conta) {
		this.codigo = codigo;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.hospede = hospede;
		this.aposento = aposento;
		this.conta = conta;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public int getAposento() {
		return aposento;
	}

	public void setAposento(int aposento) {
		this.aposento = aposento;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
	
	
}
