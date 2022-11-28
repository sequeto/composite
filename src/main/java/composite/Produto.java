package composite;

public class Produto extends Item{
	private String codigoDeBarra;
	
	public Produto(String nome, String codigoDeBarra) {
		super(nome);
		this.codigoDeBarra = codigoDeBarra;
	}

	public String getCodigoDeBarra() {
		return codigoDeBarra;
	}

	public void setCodigoDeBarra(String codigoDeBarra) {
		this.codigoDeBarra = codigoDeBarra;
	}

	public String getDescricao() {
		return this.getNome() + " - " + this.getCodigoDeBarra();
	}
}
