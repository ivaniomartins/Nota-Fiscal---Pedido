package servicos;

public interface CalculaImposto {

	public double SomaPedido();

	public double CalculaICMS(double PercentOrigem, double PercentDestino);
}
