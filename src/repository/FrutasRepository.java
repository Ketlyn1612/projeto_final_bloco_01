package repository;

import model.Fruta;

public interface FrutasRepository {


	public void procurarPorNumero(int codigo);
	public void listarTodas();
	public void cadastrar(Fruta frutas);
	public void atualizar(Fruta frutas);
	public void deletar(int numero);
	
	
}
