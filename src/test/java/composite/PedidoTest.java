package composite;

import org.junit.Test;

import static org.junit.Assert.*;

public class PedidoTest {

	@Test
    public void deveRetornarItensDoPedido() {
        Pacote pacote1 = new Pacote("Pacote de Higiene");
        Produto produto1 = new Produto("Papel Higiênico", "1691689869");        
        Produto produto2 = new Produto("Pasta Dental", "15189198152");
        Produto produto3 = new Produto("Sabonete", "81816594");
        
        pacote1.adicionarProduto(produto1);
        pacote1.adicionarProduto(produto2);
        pacote1.adicionarProduto(produto3);

        Pacote pacote2 = new Pacote("Pacote de Almoço");
        Produto produto4 = new Produto("Frango", "1518498463");        
        Produto produto5 = new Produto("Arroz", "1519856165198");
        Produto produto6 = new Produto("Feijão", "5194951648916");
        Produto produto7 = new Produto("Óleo", "6419819494919");
        
        pacote2.adicionarProduto(produto4);
        pacote2.adicionarProduto(produto5);
        pacote2.adicionarProduto(produto6);
        pacote2.adicionarProduto(produto7);

        Pacote pacoteFinalDoPedido = new Pacote("Pacote de Finalização");
        
        pacoteFinalDoPedido.adicionarProduto(pacote1);
        pacoteFinalDoPedido.adicionarProduto(pacote2);
        
        Pedido pedido = new Pedido();
        pedido.setItem(pacoteFinalDoPedido);

        assertEquals(
        		"Pacote: Pacote de Finalização\n" +
                "Pacote: Pacote de Higiene\n" +
                "Papel Higiênico - 1691689869\n" +
                "Pasta Dental - 15189198152\n" +
                "Sabonete - 81816594\n" +
                "Pacote: Pacote de Almoço\n" +
                "Frango - 1518498463\n" +
                "Arroz - 1519856165198\n" +
                "Feijão - 5194951648916\n" +
                "Óleo - 6419819494919\n", pedido.informaItems());
    }

    @Test
    void deveRetornarExecacaoDisciplinaSemEmenta() {
        try {
            Pedido pedido = new Pedido();
            pedido.informaItems();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Pedido sem Itens", e.getMessage());
        }
    }

}
