package repository;

import model.Frutas;

public interface Repository {


	public void procurarPorNumero(int codigo);
	public void listarTodas();
	public void cadastrar(Frutas frutas);
	public void atualizar(Frutas frutas);
	public void deletar(int numero);
	
	
}
