package pagamento;

import java.util.ArrayList;
import java.util.Iterator;

import boleto.Boleto;
import fatura.Fatura;

public class Pagamento {

	public void pagarFatura(ArrayList<Boleto> boletosFatura, Fatura fatura) {
		double valorTotal = 0.0;
		for (Iterator i = boletosFatura.iterator(); i.hasNext();) {
			Boleto b = (Boleto) i.next();
			valorTotal += b.getValorPago();
		}

		if (valorTotal == fatura.getvalorTotal()) {
			fatura.setstatusDaFatura("PAGA");
		} else {
			fatura.setstatusDaFatura("NÃO PAGA");
		}
	}

}
