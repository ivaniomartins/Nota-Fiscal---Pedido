package entidades;

public class ItemPedido extends Produto {

	private Double Quantidade;
	private Double ValorUnitario;

	public ItemPedido(String nmProduto, Double quantidade, Double valorUnitario) {
		super(nmProduto);
		Quantidade = quantidade;
		ValorUnitario = valorUnitario;
	}

	public double getValorTotal() {
		return this.Quantidade * this.ValorUnitario;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do Produto: " + super.getNmProduto() + "\n");
		sb.append("Quantidade: " + Quantidade + "\n");
		sb.append("Valor Unitario: " + ValorUnitario + "\n");
		sb.append("Valor Total do Produto: " + getValorTotal() + "\n");

		return sb.toString();
	}

}
