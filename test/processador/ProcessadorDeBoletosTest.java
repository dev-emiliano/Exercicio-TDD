package processador;

public class ProcessadorDeBoletosTest {

	private Fatura fatura1;
	private Fatura fatura2;
	private Fatura fatura3;
	private ArrayList<Boleto> boletosFatura1 = new ArrayList();
	private ArrayList<Boleto> boletosFatura2 = new ArrayList();
	private ArrayList<Boleto> boletosFatura3 = new ArrayList();
	private Pagamento pagamento;

	@BeforeEach
	public void inicializaProcessadorDeFaturas() {
		Fatura fatura1 = new Fatura("Samantha Costs", 3000.00, new Date());
		Fatura fatura2 = new Fatura("Lucas Roger", 2000.00, new Date());
		Fatura fatura3 = new Fatura("Luisa Spos", 1000.00, new Date());

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

	@DisplayName("Teste 1: Verifica se a fatura 1 foi paga")
	@Test
	public void testFaturaPaga1() {
		pagamento.pagarFatura(boletosFatura1, fatura1);
		assertEquals(fatura1.getstatusDaFatura(), "PAGA");
		pagamento.pagarFatura(boletosFatura2, fatura3);
		assertEquals(fatura1.getstatusDaFatura(), "PAGA");

	}

	@DisplayName("Teste 2: Verifica se a fatura 2 foi paga")
	@Test
	public void testFaturaPaga2() {
		pagamento.pagarFatura(boletosFatura2, fatura2);
		assertEquals(fatura2.getstatusDaFatura(), "PAGA");
		pagamento.pagarFatura(boletosFatura1, fatura2);
		assertEquals(fatura2.getstatusDaFatura(), "PAGA");

	}
	
	@DisplayName("Teste 3: Verifica se a fatura 3 foi paga")
	@Test
	public void testFaturaPaga3() {
		pagamento.pagarFatura(boletosFatura2, fatura1);
		assertEquals(fatura2.getstatusDaFatura(), "PAGA");
		pagamento.pagarFatura(boletosFatura1, fatura1);
		assertEquals(fatura2.getstatusDaFatura(), "PAGA");

	}

}
