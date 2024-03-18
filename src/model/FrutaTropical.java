package model;

public class FrutaTropical extends Fruta {

	private boolean citrico;

	public FrutaTropical(String nome, float valor, int codigo, int quantidade, String validade, boolean citrico) {
		super(nome, valor, codigo, quantidade, validade);
		this.citrico = citrico;
	}

	public boolean isCitrico() {
		return citrico;
	}

	public void setCitrico(boolean citrico) {
		this.citrico = citrico;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println(" É uma fruta citrica ? " + this.citrico);

	}

}
