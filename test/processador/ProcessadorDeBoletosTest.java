package processador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import boleto.Boleto;
import fatura.Fatura;
import pagamento.Pagamento;

public class ProcessadorDeBoletosTest {

	private ArrayList<Boleto> boletosFatura1 = new ArrayList();
	private ArrayList<Boleto> boletosFatura2 = new ArrayList();
	private ArrayList<Boleto> boletosFatura3 = new ArrayList();

	private Pagamento pagamento1 = new Pagamento();
	private Pagamento pagamento2 = new Pagamento();
	private Pagamento pagamento3 = new Pagamento();

	Fatura fatura1 = new Fatura("Samantha Costs", 3000.00, new Date());
	Fatura fatura2 = new Fatura("Lucas Roger", 2000.00, new Date());
	Fatura fatura3 = new Fatura("Luisa Spos", 1000.00, new Date());

	@BeforeEach
	public void inicializaProcessadorDeFaturas() {

		Boleto boleto1 = new Boleto(11111, new Date(), 2500);
		Boleto boleto2 = new Boleto(22222, new Date(), 300);
		Boleto boleto3 = new Boleto(33333, new Date(), 200);
		Boleto boleto4 = new Boleto(44444, new Date(), 1200);
		Boleto boleto5 = new Boleto(55555, new Date(), 800);
		Boleto boleto6 = new Boleto(66666, new Date(), 1000);

		boletosFatura1.add(boleto1);
		boletosFatura1.add(boleto2);
		boletosFatura1.add(boleto3);

		boletosFatura2.add(boleto4);
		boletosFatura2.add(boleto5);

		boletosFatura3.add(boleto6);

	}

	@DisplayName("Teste 1: Verifica se a fatura 1 e a fatura 2 foram pagas")
	@Test
	public void testFaturaPaga1() {
		pagamento1.pagarFatura(boletosFatura1, fatura1);
		assertEquals(fatura1.getstatusDaFatura(), "PAGA");
		
		pagamento1.pagarFatura(boletosFatura2, fatura2);
		assertEquals(fatura1.getstatusDaFatura(), "PAGA");

	}

}
