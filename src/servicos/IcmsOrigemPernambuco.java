package servicos;

public class IcmsOrigemPernambuco {

	private double IcmsOrigem = 0.07;
	private double IcmsDestino = 0.18;

	public double getIcmsOrigem() {
		return IcmsOrigem;
	}

	public double getIcmsDestino() {
		return IcmsDestino;
	}

	public double IcmsPe(CalculaImposto calc) {
		return calc.CalculaICMS(this.IcmsOrigem, this.IcmsDestino);
	}

}
