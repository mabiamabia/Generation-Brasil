package applications;

import java.util.Scanner;

import entities.Aviao;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Aviao aviao = new Aviao(null,null,null);
		
		System.out.println("Digite o nome do avi�o: ");
		aviao.nome = sc.nextLine();
		System.out.println("O nome do avi�o �: "+aviao.nome);
		
		System.out.println("Digite a capacidade de pessoas do avi�o: ");
		aviao.capacidade = sc.nextDouble();
		System.out.println("A capacidade de tripulantes do avi�o �: "+aviao.capacidade);
		
		System.out.println("Digite a quantidade de voos que esse avi�o ja fez: ");
		aviao.quantidadeVoo = sc.nextFloat();
		System.out.println("esse avi�o ja realizou: "+aviao.quantidadeVoo+ " voos");
		
		
		sc.close();
		

	}

}
