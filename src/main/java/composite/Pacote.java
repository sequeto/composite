package composite;

import java.util.ArrayList;
import java.util.List;

public class Pacote extends Item{
	private List<Item> itens;
	
	public Pacote(String nome) {
		super(nome);
		this.itens = new ArrayList<Item>();
	}
	
    public void adicionarProduto(Item item) {
        this.itens.add(item);
        this.setValor(this.getValor() + item.getValor()); 
    }

	public String getDescricao() {
		String saida = "";
        saida = "Pacote: " + this.getDescricao() + "\n";
        for (int i = 0; i < itens.size(); i++) {
            saida += itens.get(i).getDescricao() + "\n";
        }
        return saida;
	}
}
