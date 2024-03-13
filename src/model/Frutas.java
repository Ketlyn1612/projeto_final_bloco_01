package model;

public abstract class Frutas  {
	
	private float valor;
	private String nome;
	private int codigo;
	private int quantidade;
	private String validade;
	
	
	public Frutas(float valor, String nome, int codigo, int quantidade, String validade) {
		
		
		this.valor = valor;
		this.nome = nome;
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
			System.out.println("Validade: " + this.valor);
			System.out.println("Validade: " + this.nome);
			System.out.println("Validade: " + this.codigo);
			System.out.println("Validade: " + this.quantidade);
			System.out.println("Validade: " + this.validade);




		}

}
