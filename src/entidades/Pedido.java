package entidades;

import java.util.ArrayList;
import java.util.List;

import servicos.CalculaImposto;

public class Pedido implements CalculaImposto {
	private Integer NrPedido;

	private double soma;

	List<ItemPedido> list = new ArrayList<>();

	public Pedido(Integer nrPedido) {
		super();
		NrPedido = nrPedido;
	}

	public Pedido(Integer nrPedido, double soma) {

		NrPedido = nrPedido;
		this.soma = soma;
	}

	public Integer getNrPedido() {
		return NrPedido;
	}

	public void setNrPedido(Integer nrPedido) {
		NrPedido = nrPedido;
	}

	public List<ItemPedido> getList() {
		return list;
	}

	public void AddItem(ItemPedido item) {
		list.add(item);
	}

	public void RemoveItem(ItemPedido item) {
		list.remove(item);
	}

	@Override
	public double SomaPedido() {

		double sum = soma;

		for (ItemPedido itp : list) {

			sum += itp.getValorTotal() + this.soma;
		}
		return sum;
	}

	@Override
	public double CalculaICMS(double PercentOrigem, double PercentDestino) {

		double ValorBase;
		double ValorTotal;
		ValorBase = SomaPedido() - (SomaPedido() * (PercentOrigem));
		ValorTotal = (ValorBase / (100 - (PercentDestino * 100))) * 100;

		return ValorTotal * ((PercentDestino) - (PercentOrigem));
	}

}
