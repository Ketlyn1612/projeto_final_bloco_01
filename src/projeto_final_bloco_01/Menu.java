package projeto_final_bloco_01;

import java.util.Scanner;

import controller.FrutasController;
import model.FrutaTropical;

public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		FrutasController frutas = new FrutasController();

		int opcao;
		float valor;
		String nome;
		int codigo;
		int quantidade;
		String validade;
		boolean citrico;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("              FRUTAS FRESCAS OLIVEIRA                ");
			System.out.println("          distribuidora de frutas frescas            ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastra Fruta                       ");
			System.out.println("            2 - Atualizar Fruta                      ");
			System.out.println("            3 - Listar todas as frutas               ");
			System.out.println("            4 - Deletar Fruta                        ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Selecione a opção desejada e faça seu pedido:        ");

			opcao = leia.nextInt();

			if (opcao == 5) {
				System.out.println("\nHORTIFRUTI !");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(" Cadastro de Fruta: ");

				System.out.println(" Digite o nome: ");
				leia.skip("\\R?");
				nome = leia.nextLine();

				System.out.println(" Digite o valor da fruta: ");
				valor = leia.nextFloat();

				System.out.println(" Digite o codigo: ");
				codigo = leia.nextInt();

				System.out.println(" Digite a quantidade: ");
				quantidade = leia.nextInt();

				System.out.println(" Digite a validade: ");
				leia.skip("\\R?");
				validade = leia.nextLine();

				System.out.println(" É uma fruta tropical? True|False");
				citrico = leia.nextBoolean();
				
				frutas.cadastrar(new FrutaTropical(nome,valor,codigo,quantidade,validade,citrico));

				break;
			case 2:

				System.out.println(" Atualiza Fruta:\n\n");
				
				System.out.println(" Digite o codigo da fruta: ");
				codigo = leia.nextInt();
				var procurarFruta = frutas.procurarNaCollection(codigo);
				if ( procurarFruta != null ) {
					System.out.println(" Digite o nome: ");
					leia.skip("\\R?");
					nome = leia.nextLine();

					System.out.println(" Digite o valor da fruta: ");
					valor = leia.nextFloat();

					System.out.println(" Digite o codigo: ");
					codigo = leia.nextInt();

					System.out.println(" Digite a quantidade: ");
					quantidade = leia.nextInt();

					System.out.println(" Digite a validade: ");
					leia.skip("\\R?");
					validade = leia.nextLine();

					System.out.println(" É uma fruta tropical? True|False");
					citrico = leia.nextBoolean();
					
					frutas.atualizar(new FrutaTropical(nome,valor,codigo,quantidade,validade,citrico));

				}
				
				else {
					System.out.println(" Produto não encontrado! ");
				}

				break;
			case 3:
				System.out.println(" Listar todas as frutas:\n\n");

				
				frutas.listarTodas();
				break;
			case 4:
				System.out.println(" Deletar Fruta:\n\n");
				
				System.out.println(" Digite o codigo da fruta:");
				codigo = leia.nextInt();
				frutas.deletar(codigo);
				

				break;
			default:
				System.out.println(" Escolha uma opção Valida!");
				break;

			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Ketlyn suellen dos santos ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("https://github.com/Ketlyn1612/projeto_final_bloco_01");
		System.out.println("*********************************************************");
	}
}