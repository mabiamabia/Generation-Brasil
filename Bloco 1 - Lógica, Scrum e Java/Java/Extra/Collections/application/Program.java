package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ArrayList<String> estoque = new ArrayList();
		int op;
		
		
		//menu de opções
		do {
			System.out.println("Menu de Opções");
			System.out.println("-------------------------");
			System.out.println("1 - Inserir produto \n2 - Remover produto \n3 - Atualizar lista \n4 - Visualizar lista \n5 - Sair do programa");
			System.out.println("\nDigite o numero da opção que deseja: ");
			op = sc.nextInt();
			
			
			switch(op) {
			case 1:
				sc.nextLine();
				//inserir produto na lista
				System.out.println("Digite o produto que deseja inserir no estoque: ");
				String inserirProduto = sc.nextLine();
				estoque.add(inserirProduto);
				break;
			case 2:
				sc.nextLine();
				//remover produto na lista
				System.out.println("Digite o produto que deseja remover da lista: ");
				String removerProduto = sc.nextLine();
				if(estoque.contains(removerProduto)) { //estoque é o nome da lista
					estoque.remove(removerProduto);
				}else {
					System.out.println("Não existe este produto no estoque!");
				}
			case 3:
				sc.nextLine();
				//atualizar lista
				System.out.println("Qual o produto que deseja substituir? ");
				String sair = sc.nextLine();
				
				System.out.println("Qual o produto que deseja adicionar? ");
				String entrar = sc.nextLine();
				if(estoque.contains(sair)) {
					estoque.remove(sair);
					estoque.add(entrar);
				}else {
					System.out.println("Não existe este produto no estoque!");
				}
			case 4:
				//mostrar lista completa
				System.out.println("Produtos no Estoque: ");
				System.out.println(estoque);
				
			}
		}
		
		while(op != 5);

		sc.close();	
		
	}
}
