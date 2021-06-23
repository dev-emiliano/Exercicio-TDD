package boleto;

import java.util.Date;

public class Boleto {
	private int codigoDoBoleto;
	private Date dataVencimento;
	private double valorPago;

	public Boleto(int codigoDoBoleto, Date dataVencimento, double valorPago) {
		this.codigoDoBoleto = codigoDoBoleto;
		this.dataVencimento = dataVencimento;
		this.valorPago = valorPago;
	}

	public int getCodigoDoBoleto() {
		return codigoDoBoleto;
	}

	public void setCodigoDoBoleto(int codigoDoBoleto) {
		this.codigoDoBoleto = codigoDoBoleto;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
}