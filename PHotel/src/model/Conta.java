package model;

import java.util.List;

public class Conta {
	private int codigo;
	private double valorTotal;
	private boolean pago;
	private List<Consumo> consumos;
	
	public Conta() {
		
	}

	public Conta(int codigo, double valorTotal, boolean pago, List<Consumo> consumos) {
		this.codigo = codigo;
		this.valorTotal = valorTotal;
		this.pago = pago;
		this.consumos = consumos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public List<Consumo> getConsumos() {
		return consumos;
	}

	public void setConsumos(List<Consumo> consumos) {
		this.consumos = consumos;
	}
	
	

}
