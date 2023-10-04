
public class ControleCliente {
    private Cliente cliente;
	
    public void salvarClienteNoBancoDeDados(Cliente cliente) {
        System.out.println("Salvando cliente no banco");
    }

    public void enviarEmailConfirmacao() {
        System.out.println("Enviando email para confima��o!!!");
    }

    public void gerarFatura(Fatura fatura) {
        System.out.println("Valor da fatura: " + fatura.getValor());
        System.out.println("Vencimento da fatura: " + fatura.getDataVencimento());
        System.out.println("Situa��o da fatura: " + fatura.isEstaPago());
    }


}
