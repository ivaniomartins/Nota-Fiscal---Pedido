package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.ItemPedido;
import entidades.Pedido;
import servicos.IcmsOrigemPernambuco;

public class ProcessamentoDoPedido {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe  o n�mero do pedido: ");
		int NrPedido = sc.nextInt();
		Pedido pedido = new Pedido(NrPedido);
		System.out.print("Informe quantos itens ser�o inseridos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Informe o produto: ");
			String nomeProduto = sc.next();
			System.out.print("Informe a quantidade: ");
			double quantidade = sc.nextDouble();
			System.out.print("Informe o Valor Unit�rio: ");
			double valorUnitario = sc.nextDouble();

			ItemPedido item = new ItemPedido(nomeProduto, quantidade, valorUnitario);
			// System.out.print("Produto: " + item.getNmProduto() + " Valor Total: "+
			// String.format("%.2f", item.getValorTotal()));
			pedido.AddItem(item);
		}
		System.out.println();
		System.out.println("N�mero do Pedido: " + pedido.getNrPedido());
		System.out.print("Itens do Pedido: ");
		System.out.println();
		for (ItemPedido itempedi : pedido.getList()) {
			System.out.println(itempedi);

		}
		System.out.println("Quantidade de Itens: " + n);
		System.out.println("Valor total do Pedido: " + pedido.getNrPedido() + " R$" + pedido.SomaPedido());

		IcmsOrigemPernambuco icms = new IcmsOrigemPernambuco();

		System.out.println("Total do ICMS: ");
		System.out.println(String.format("%.2f", icms.IcmsPe(pedido)));

		sc.close();

	}

}
