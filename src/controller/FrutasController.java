package controller;

import java.util.ArrayList;

import model.Fruta;
import repository.FrutasRepository;

public class FrutasController implements FrutasRepository {

	private ArrayList<Fruta> frutas = new ArrayList<Fruta>();

	@Override
	public void procurarPorNumero(int codigo) {

	}

	@Override
	public void listarTodas() {
		for (var fruta : frutas) {
			fruta.visualizar();
		}

	}

	@Override
	public void cadastrar(Fruta fruta) {
		this.frutas.add(fruta);
		System.out.println(" A  " + fruta.getNome() + " foi cadastrada com sucesso! ");
	}

	@Override
	public void atualizar(Fruta fruta) {
		var procurarCodigo = procurarNaCollection(fruta.getCodigo());
		if (procurarCodigo != null) {
			this.frutas.set(this.frutas.indexOf(procurarCodigo), fruta);
			System.out.println("O " + fruta.getCodigo() + " foi atualizado com sucesso! ");

		} else {
			System.out.println("O " + fruta.getCodigo() + " não foi encontrado! ");

		}

	}

	@Override
	public void deletar(int numero) {
		var fruta = procurarNaCollection(numero);
		if (fruta != null) {
			if (frutas.remove(fruta)) {
				System.out.println("O " + numero + " foi deletado com sucesso! ");	
			}
		
		} else {
			System.out.println("O " + numero + " não foi encontrado! ");

		}


	}

	public Fruta procurarNaCollection(int codigo) {
		for (var fruta : frutas) {
			if (fruta.getCodigo() == codigo) {
				return fruta;
			}
		}

		return null;
	}

}
