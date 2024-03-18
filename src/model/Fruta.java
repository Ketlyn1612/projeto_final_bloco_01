package model;

public abstract class Fruta  {
	
	private String nome;
	private float valor;
	private int codigo;
	private int quantidade;
	private String validade;
	
	
	public Fruta( String nome,float valor, int codigo, int quantidade, String validade) {
		
		
		
		this.nome = nome;
		this.valor = valor;
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.validade = validade;
	}


	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	public void visualizar() {
			System.out.println(" Nome: " + this.nome);
			System.out.println(" Valor: " + this.valor);
			System.out.println(" Codigo: " + this.codigo);
			System.out.println(" Quantidade: " + this.quantidade);
			System.out.println(" Validade: " + this.validade);




		}

}
