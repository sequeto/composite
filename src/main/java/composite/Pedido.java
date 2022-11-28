package composite;

public class Pedido {
	private Item item;

    public void setItem(Item item) {
        this.item = item;
    }

    public String informaItems() {
        if (this.item == null) {
            throw new NullPointerException("Pedido sem Item");
        }
        return this.item.getDescricao();
    }
}
