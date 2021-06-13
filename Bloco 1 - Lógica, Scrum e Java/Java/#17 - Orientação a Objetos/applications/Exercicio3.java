package applications;

import java.util.Scanner;

import entities.ProdutoEletronico;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		ProdutoEletronico produtoeletronico = new ProdutoEletronico(null,null,null);
		
		System.out.println("Digite o nome do produto: ");
		produtoeletronico.nome = sc.nextLine();
		System.out.println("O nome do produto: "+produtoeletronico.nome);
		
		System.out.println("Digite o preço do produto: ");
		produtoeletronico.preco = sc.nextDouble();
		System.out.println("O preço do produto é: "+produtoeletronico.preco);
		
		System.out.println("Digite a quantidade de produtos no estoque: ");
		produtoeletronico.quantidadeEstoque = sc.nextInt();
		System.out.println("Existem: "+produtoeletronico.quantidadeEstoque+ " "+produtoeletronico.nome+ " no estoque");
		
		sc.close();
		
	}
		
}
