package br.com.project;


import java.util.Scanner;

import br.com.project.modelos.Pessoa;
import br.com.project.service.Service;

public class Menu {

	public static void main(String[] args) {
		
		Service s=new Service();
		
		Scanner input = new Scanner(System.in);
		int opcion;
		

		do {
			System.out.println("+=========================================+");
			System.out.println("|    *******MUNDO DO AUTOMOVEL*******     |");
			System.out.println("|          MENU DE OPÇÕES                 |");
			System.out.println("|       1- Cadastrar Carro na Loja        |");
			System.out.println("|  	2- Pesquisar Carros(Placa)        |"); 
			System.out.println("|       3- Pesquisar Carros (Marca/Modelo)|");
			System.out.println("|       4- Pesquisar Carros (Ano)         |");  
			System.out.println("|       5- Listagem de todos os Carros    |");
			System.out.println("|       6- Informações da Loja            |");
			System.out.println("|       0 - Sair                          |");
			System.out.println("+=========================================+");

		
		
			opcion=input.nextInt();
			
			
			switch (opcion) {
			
			case 1:
				
			
			System.out.println("digite o modelo do carro");
			String modelo=input.next();
			
			
			System.out.println("digite a placa ");
			String placa=input.next();
			
			
			System.out.println("digite o ano");
			int ano=input.nextInt();
			
			
			System.out.println("digite a marca");
			String marca=input.next();
			
			System.out.println("valor estimado do carro");
			Double valor=input.nextDouble();
			
			System.out.println("digite o nome do responsavel do carro atualmente");
			String nome=input.next();
			
			System.out.println("numero de CPF");
			String cpf=input.next();
			
			System.out.println("numero de contato");
			String tel=input.next();
			
			
			
			s.salvar(marca, modelo, placa, ano, valor,nome,cpf,tel);
			
			break;
			
			case 2:
				s.placas();
				
				break;
			
			case 3:
				s.marcasModelos();
				
				break;
			
			case 4:
				s.listarPorAno();
				
				break;
			
			case 5:
				
				s.listarCarros();
				
				break;
				
			case 6:
				System.out.println("SEJA BEMNVIDO A LOJA DO AUTOMOVEL USUADOS\nPARA MAIORES INFORMACOES ENTRE NO SITE www.MundoDoAutomovel.com.br\n atualmente temos :");
				s.quantidade();
			
			default:
				System.out.println("");
			}
		
		
	
	}while(opcion !=0);
	
	input.close();
	System.out.println("fim do programa");
	

}
}
